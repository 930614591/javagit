package JDBC_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//Connection详解事务管理
public class JDbcCT3 {
    public static void main(String[] args) throws Exception {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://192.168.5.222:3306/test";
        String username="root";
        String password="123456";
        Connection conn= DriverManager.getConnection(url,username,password);

        //sql
        String sql="update sjj set id=10 where id=5";
        String sql1="update sjj set id=10 where id=5";
        String sql2="update sjj set id=10 where id=5";
        //4获取执行sql的对象
        Statement stmt=conn.createStatement();
        //6.执行sql
        //开启事务
        int count=stmt.executeUpdate(sql);
        System.out.println(count);

        //6.执行sql
        //提交事务
        try {
            //开启事务
            conn.setAutoCommit(false);

            int count1=stmt.executeUpdate(sql1);
            System.out.println(count);
            int i=3/0;
            //6.执行sql
            int count2=stmt.executeUpdate(sql2);
            System.out.println(count);
            //提交事务
            conn.commit();
        } catch (Exception e) {
            //回滚事务
            conn.rollback();
            throw new RuntimeException(e);

        }

        stmt.close();
        conn.close();
    }
}
