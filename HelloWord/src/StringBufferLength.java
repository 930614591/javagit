
public class StringBufferLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//缓冲区字符串的操作
		StringBuffer stringBuffer=new StringBuffer(8);	//创建指定长度的字符串缓冲区变量
		stringBuffer.append("abcdefg");					//给strbuff添加字符串
		System.out.println(stringBuffer.length());		//输出stringbuffer的长度
		System.out.println(stringBuffer.capacity());	//输出stringbuffer的容量
		System.out.println(stringBuffer.toString()+"**");	//转化成String字符并输出
		
		 
		stringBuffer.setLength(10); 						//设置stringbuffer的长度为10
		System.out.println(stringBuffer.length());		//输出stringbuffer的长度
		System.out.println(stringBuffer.capacity());	//输出stringbuffer的容量
		System.out.println(stringBuffer.toString()+"**");	//转化成String字符并输出
		
		stringBuffer.setLength(3); 						//设置stringbuffer的长度为10
		System.out.println(stringBuffer.length());		//输出stringbuffer的长度
		System.out.println(stringBuffer.capacity());	//输出stringbuffer的容量
		System.out.println(stringBuffer.toString()+"**");	//转化成String字符并输出
	}

}
