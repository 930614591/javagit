package ex13_2_4;

public class Employee {
	static String nameString;//创建String类型的数据域
	static int age;//chuangjian创建int类型的数据域age
	final static int LEN=8;//创建并初始化静态
	public Employee(String nameString,int age) {
		if(nameString.length()>LEN) {
			nameString=nameString.substring(0, 8);//截取字符串的子字符串
		}else {
			while (nameString.length()<LEN) {
				nameString=nameString+"\u0000";
			}
		}
		this.nameString=nameString;//初始化namestring
		this.age=age;//初始化age
	}
	//用于返回name
	public static String getName() {
		return nameString;
	}
	//用于返回age
	public static int getAge() {
		return age;
	}
	//设置name
	public void setName(String nameString) {
		this.nameString=nameString;//修改name的引用
	}
	//设置age
	public void setAge(int age) {
		this.age=age;//修改age的值
		
	}
	//huoqulei获取类的占用空间
	public static int size() {
		return 2*8+4;//字符串长度是八，一个字符占用两个字节，一个整形占用四字节
		
	}
}
