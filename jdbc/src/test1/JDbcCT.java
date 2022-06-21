package test1;

import java.sql.*;

public class JDbcCT {
    public static void main(String[] args) throws Exception {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://192.168.5.222:3306/test";
        String username="root";
        String password="123456";
        Connection conn= DriverManager.getConnection(url,username,password);

        //sql
        String sql="database()";
        //4获取执行sql的对象
        Statement stmt=conn.createStatement();
    }
}
