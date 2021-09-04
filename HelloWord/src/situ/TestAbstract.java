package situ;

public  class TestAbstract extends tb {
	//普通子类必须对抽象父类方法重写，子类若是抽象方法，则不用重写
	//tb tb=new tb();//抽象类不可以直接实例化
	@Override
	void t2() {
		// TODO Auto-generated method stub
		
	}
}
abstract class tb {
	//抽象类
	//静态/实例成员
	abstract void t2();//抽象方法，只能放在抽线类里
	//之定义声明，不含具体实现
	//不一定包含抽象方法
	//由抽象方法必定是抽象类
	void test (){
		
	}
	
	//抽象类中可以有构造方法，静态方法，但不能声明为抽象
	public tb() {
		System.out.println("---------");
	}
}