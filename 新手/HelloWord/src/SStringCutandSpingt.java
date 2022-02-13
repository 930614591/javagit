
public class SStringCutandSpingt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//截取字符串
		String strtow="ni haoni ahini hao";
		int le=strtow.length();//获取字符串长度
		System.out.println("字符串长度为"+le);
		int b=strtow.indexOf(" ");								//第一个空格的位置
		System.out.println("字符中第一次出现空格的位置索引是"+b);
		int e =strtow.lastIndexOf("o");							//最后一个o的位置
		System.out.println("字符中最后一次出现o的位置索引是"+e);
		String strb =strtow.substring(0, e);
		System.out.println(strb);
		String strb2 =strtow.substring(b+1,le);
		System.out.println(strb2);
															
																//用空格拆分
		System.out.println("拆分后的字符串内容为：");
		String strarrry[]=strtow.split(" ");
		for(int i=0;i<strarrry.length;i++) {
			System.out.println(strarrry[i]);
		}
	}

}
