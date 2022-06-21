package JDBC_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDbcCT5_ResultSet {
    public static void main(String[] args) throws Exception {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://192.168.5.222:3306/test";
        //这里的192.168.5.222:3306指的是我mysql服务器的ip如果是本机的mysql的话用下面这段
        //String url="jdbc:mysql://127.0.0.1:3306/test";
        //test指的是所需要用的数据库系统中的具体某一个数据库
        String username="root";
        String password="123456";
        //数据库的账号密码
        Connection conn= DriverManager.getConnection(url,username,password);

        //sql
        String sql="select * from sjj";
        //4获取执行sql的对象
        Statement stmt=conn.createStatement();
        //6.执行查询，得到ResultSet
        ResultSet resultSet=stmt.executeQuery(sql);
        //处理ResultSet
        System.out.println("book_id\t|\tbook_name");
        System.out.println(resultSet);
        while(resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            System.out.print(id +"\t\t\t");
            System.out.print(name +"\n");

        }
        stmt.close();
        conn.close();
    }
}
