package situ;

public class t09032 {
	public static void f0(String s1,String... strings ) {
		String[] s0;
		//不定参数类
		//不定参数会转换成数组
		System.out.println(strings.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//f0(null, args);
		f0("12", args);
		f0("12", "111","111","111");
	}

}
