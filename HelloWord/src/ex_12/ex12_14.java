package ex_12;
import java.lang.ClassNotFoundException;
import java.sql.Statement;//数据库SQL语句处理支持包
import java.sql.Connection;//数据库链接支持包
import java.sql.ResultSet;//数据库结果集处理支持包
import java.sql.DriverManager;//daoru导入数据库驱动管理包

public class ex12_14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement  stmt=null;
		ResultSet rst=null;
		String string="";
		//zhuce注册驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得数据库的链接
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myuser", "root", "root");
		//创建会话声明
		stmt=connection.createStatement();
		rst =stmt.executeQuery("select*from user");//使用查询语句获取数据
		while(rst.next()) {
			//对查询时获得的语句进行格式转换
			System.out.print(string=new String(rst.getString(1).getBytes("ISO-8859-1"),"GBK")+"--");
			System.out.print(string=new String(rst.getString(2).getBytes("ISO-8859-1"),"GBK")+"--");
			System.out.print(string=new String(rst.getString(3).getBytes("ISO-8859-1"),"GBK")+"--");
			System.out.print(string=new String(rst.getString(4).getBytes("ISO-8859-1"),"GBK"));
			System.out.println();
		}
	}

}
