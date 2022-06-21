package JDBC_API;

import org.testng.annotations.Test;

import java.sql.*;

//Statement
public class JDbc4_Statement {
    /*
    执行dml语句
     */
    @Test
    /*
    测试方法
     */
    public void testDML() throws Exception {
        //
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://192.168.5.222:3306/test";
        String username="root";
        String password="123456";
        Connection conn= DriverManager.getConnection(url,username,password);

        //sql
        String sql="update sjj set id=10 where id=5";
        //4获取执行sql的对象
        Statement stmt=conn.createStatement();
        //6.执行sql
        int count=stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();
    }

    @Test
    public void jdbcDDL() throws Exception{
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://192.168.5.222:3306/test";
        String username="root";
        String password="123456";
        Connection conn= DriverManager.getConnection(url,username,password);

        //sql
        String sql="create database db2";
        //4获取执行sql的对象
        Statement stmt=conn.createStatement();
        //6.执行sql 、、DDL语句返回值不再是数字。所以下面的方法注释掉
        try {
            stmt.executeUpdate(sql);
            System.out.println("执行成功");
        } catch (Exception e) {
            System.out.println("执行失败");
            throw new RuntimeException(e);

        }
//        if(count>0){
//              System.out.println("执行成功");
//        }else {
//               System.out.println("执行失败");
//        }
        stmt.close();
        conn.close();
    }
}
