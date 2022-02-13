package ex14MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.sql.*;

//import com.mysql.*;
public class MySQL14_1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
			//Class.forName("org.gjt.mm.mysql.Driver");
			String urlString="jdbc:mysql://127.0.0.1:3306/mydb?user=root&password=root&useSSL=false&serverTimezone=Asia/Shanghai";
			Connection connection=DriverManager.getConnection(urlString);
			

			System.out.println("找到驱动程序类！");
			if (connection!=null) {
				System.out.println("数据库连接成功！");
			}
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employees where id=? OR sex=? order by entrydate");
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "m");
			ResultSet resultSet=preparedStatement.executeQuery();//zhixingsql语句
			System.out.println("id\t|name\t|sex\t|entrydate\t|department\t|others");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id")+"\t|"+resultSet.getString("name")+"\t|"
							+resultSet.getString("sex")+"\t|"+resultSet.getString("entrydate")+"\t|"
							+resultSet.getString("department")+"\t|\t|"+resultSet.getString("others")+"");
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("meiyou找到驱动程序类！");
			e.printStackTrace();
		}

	}

}
