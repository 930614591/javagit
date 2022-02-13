package ex_12;

import java.sql.*;

public class ex12_9 {
	//可能会抛出异常类的方法
	public static class ExceptionThreestep{
		public static void throwException() throws SQLException{
			try {
				throw new SQLException("SQLException1");
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("throwException()抛出异常"+e.getMessage());
				//捕获的异常不处理，抛出
				throw new SQLException("SQLException1");
			}
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				throwException();
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("main捕获SQL Exception："+e.getMessage());
			}

		}

	}
}
