package ex_12;
import java.lang.ClassNotFoundException;
import java.sql.Statement;//���ݿ�SQL��䴦��֧�ְ�
import java.sql.Connection;//���ݿ�����֧�ְ�
import java.sql.ResultSet;//���ݿ���������֧�ְ�
import java.sql.DriverManager;//daoru�������ݿ����������

public class ex12_14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement  stmt=null;
		ResultSet rst=null;
		String string="";
		//zhuceע����������
		Class.forName("com.mysql.jdbc.Driver");
		//������ݿ������
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myuser", "root", "root");
		//�����Ự����
		stmt=connection.createStatement();
		rst =stmt.executeQuery("select*from user");//ʹ�ò�ѯ����ȡ����
		while(rst.next()) {
			//�Բ�ѯʱ��õ������и�ʽת��
			System.out.print(string=new String(rst.getString(1).getBytes("ISO-8859-1"),"GBK")+"--");
			System.out.print(string=new String(rst.getString(2).getBytes("ISO-8859-1"),"GBK")+"--");
			System.out.print(string=new String(rst.getString(3).getBytes("ISO-8859-1"),"GBK")+"--");
			System.out.print(string=new String(rst.getString(4).getBytes("ISO-8859-1"),"GBK"));
			System.out.println();
		}
	}

}
