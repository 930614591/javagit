package JDBC_API;

import org.testng.annotations.Test;
import pojo.sjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDbcCT6_Userlogin {
    @Test
    public void  ResultSet1() throws Exception {
        //1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://192.168.5.222:3306/test";
        //这里的192.168.5.222:3306指的是我mysql服务器的ip如果是本机的mysql的话用下面这段
        //String url="jdbc:mysql://127.0.0.1:3306/test";
        //test指的是所需要用的数据库系统中的具体某一个数据库
        String username="root";
        String password="123456";
        //数据库的账号密码
        Connection conn= DriverManager.getConnection(url,username,password);

        //接收用户名和密码
        String Username="仙逆";
        String pwd="6";

        String sql="select * from sjj where name='"+Username+"' and id="+pwd+"";
        System.out.println(sql);
        //获取sql对象
        Statement stmt=conn.createStatement();

        //执行sql语句
        ResultSet rs=stmt.executeQuery(sql);

        //判断登陆是否成功
        if(rs.next()){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
        //释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
