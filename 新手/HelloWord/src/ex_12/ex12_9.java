package ex_12;

import java.sql.*;

public class ex12_9 {
	//���ܻ��׳��쳣��ķ���
	public static class ExceptionThreestep{
		public static void throwException() throws SQLException{
			try {
				throw new SQLException("SQLException1");
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("throwException()�׳��쳣"+e.getMessage());
				//������쳣�������׳�
				throw new SQLException("SQLException1");
			}
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				throwException();
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("main����SQL Exception��"+e.getMessage());
			}

		}

	}
}
