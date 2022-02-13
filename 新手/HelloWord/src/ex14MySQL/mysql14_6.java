/*
package ex14MySQL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;

import com.mysql.*;*//*

class ExecuteDDL{
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	public void executeSql(String sqlString) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String urlString="jdbc:mysql://127.0.0.1:3306/mydb?user=root&password=root&useSSL=false&serverTimezone=Asia/Shanghai";
			Connection connection=DriverManager.getConnection(urlString);
			statement =connection.createStatement();
			boolean hasResultSet=statement.execute(sqlString);
			if (hasResultSet) {
				
				resultSet=statement.getResultSet();
				ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
				int columnCount=resultSetMetaData.getColumnCount();
				
				while (resultSet.next()) {
					for(int i=0;i<columnCount;i++) {
						System.out.print(resultSet.getString(i+1)+"\t");
					}
					System.out.println();
				}
				
			}else {
				System.out.println("该语句影响的记录有"+statement.getUpdateCount()+"条");
			}
		} finally {
			// TODO: handle exception
			if (resultSet!=null) {
				resultSet.close();
			}
			if (statement!=null) {
				statement.close();
			}
			if (connection!=null) {
				connection.close();
			}
		}
	}
}

public class mysql14_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecuteDDL executeDDL=new ExecuteDDL();
		executeDDL.executeSql("drop table if exists school");
		executeDDL.executeSql("create table school (id int ,name varchar(50) ,addr varchar(50))");
		executeDDL.executeSql("insert into school values(1,'No1','BeiJing')");
		executeDDL.executeSql("insert into school values(2,'No2','Wuhan')");
		executeDDL.executeSql("select * from school");
		
		

	}

}
*/
