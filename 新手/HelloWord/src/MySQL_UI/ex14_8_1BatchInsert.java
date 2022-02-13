/*
package MySQL_UI;
import java.sql.*;

import javax.sql.ConnectionEventListener;

import com.mysql.*;


public class ex14_8_1BatchInsert {
	Connection connection=null;
	public Connection gitConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//加载数据库驱动
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//定义与数据库的URL
		String urlString="jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&serverTimezone=Asia/Shanghai";
		String userString="root";
		String passwordString="root";
		
		try {
			//获取数据库连接
			connection=DriverManager.getConnection(urlString, userString, passwordString);
			if (connection != null) {
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
	
	public void insertStu(String sqlString) {
		connection=gitConn();//获取数据库链接
		try {
			Statement statement=connection.createStatement();//创建statement对象
			//动态建表
			System.out.println("00001");

			statement.execute("create table if not exists student "
					+ "(id int,name varchar(15), sex char, age int, subject varchar(15),"
					+ "mark int,primark int)");
			System.out.println("00002");
			statement.execute(sqlString);//执行插入语句
			System.out.println("00003");
			System.out.println("插入数据成功！");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex14_8_1BatchInsert insert=new ex14_8_1BatchInsert();//创建本类对象
		String sqlString="insert student select '7','李丽丽','女','21','计算机科学与技术','85',1";
		insert.insertStu(sqlString);
	}

}
*/
