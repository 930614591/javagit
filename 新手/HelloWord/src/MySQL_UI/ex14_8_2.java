/*
package MySQL_UI;

import java.io.*;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.sql.*;
import com.mysql.*;


public class ex14_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成测试类
		try {
			//将保存的图片文件生成对象
			File file=new File("rec/2.jpg");
			if (Image_byte(null, file)) {
				System.out.println("TTTTTTT");
			}else {
				System.out.println("FFFFFF");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("图片生成文件对象失败"+e.getMessage());
		}

	}
	
	//将图片文件转换成byte数组
	public static boolean  Image_byte(String sqlstr,File file){
		try {
			//将文件对象流话，并在内存中开辟相同大小的缓冲区
			FileInputStream fin=new FileInputStream(file);
			//创建字节缓冲区，并分配文件大小空间
			ByteBuffer nbf=ByteBuffer.allocate((int)file.length());
			//ByteBuffer nbf=ByteBuffer.allocate((int)file.length());
			byte[] array=new byte[1024];
			int offset=0,length=0;
			//存放字节流
			while((length=fin.read(array))>0) {
				if (length!=1024) {
					nbf.put(array, 0,length);
				
				}else {
					nbf.put(array);
				}
				offset+=length;
			}
			fin.close();//关闭文件流
			byte[] content=nbf.array();
			System.out.println("文件大小"+content.length+"字节");                                //输出文件字节数
			return LoadImage(sqlstr,content);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("图片转化type数组失败"+e.getMessage());
		}
		return false;
	}

	private static boolean LoadImage(String sqlstr, byte[] in) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if (sqlstr==null) {
			sqlstr="select * from images";
			try {
				Connection connection=getConnection();//获取链接生成记录集
				Statement stmtStatement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rSet=stmtStatement.executeQuery(sqlstr);
				if (rSet.next()) {//如果记录存在就更新记录
					rSet.updateBytes(3, in);
					rSet.updateRow();
					System.out.println("updateRow");
					
					
				}else {
					//否则就插入新记录
					rSet.moveToInsertRow();
					rSet.updateString(2, "01");
					rSet.updateBytes(3, in);
					rSet.insertRow();
					System.out.println("insterRow");
				}
				rSet.close();
				flag=true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("图片存入数据库失败"+e.getMessage());

			}
			return flag;
		}
		return flag;
	}

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String urlString="jdbc:mysql://127.0.0.1:3306/mydb?user=root&password=root&useSSL=false&serverTimezone=Asia/Shanghai";
			connection=DriverManager.getConnection(urlString);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("数据库连接失败"+e.getMessage());
		}
		return connection;
	}

}
*/
