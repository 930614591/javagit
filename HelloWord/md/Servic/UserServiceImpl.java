package Servic;

import Dao.UserDao;
import Dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	//直接在这里调用dao层
	private UserDao userDao;//=new UserDaoImpl();
	//在这里对dao层调用对UserdaoImpl类调用，创建dao对象
	public void setUser(UserDao userDao) {
		this.userDao=userDao;
	}
	@Override
	public void getUser() {
		// TODO Auto-generated method stub
		userDao.getUser();
		//在这里对dao对象内方法操作，调用getUser方法输出语句
		
		
	}

}
