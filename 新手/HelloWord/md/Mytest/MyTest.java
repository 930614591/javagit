package Mytest;

import Dao.UserDaoMysqlImpl;
import Servic.UserServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在这里实现测试类,用户实际调用的是业务层，dao曾不需要接触
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		////Service内的方法调用dao
		
		userServiceImpl.setUser(new UserDaoMysqlImpl());
		userServiceImpl.getUser();
	}

}
