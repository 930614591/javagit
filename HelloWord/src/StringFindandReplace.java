
public class StringFindandReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="vbasic";
		System.out.println("str1 = "+str1);
		String str2="Vbasic";
		System.out.println("str2 = "+str2);
		String str=str1.concat(str2);				//�ϲ��ַ�������ֵ��str
		System.out.println("str = "+str);	
		String str3= str1.toUpperCase();			//ת���ɴ�д��ĸ
		System.out.println("str3 = "+str3);
		String str4= str2.toLowerCase();			//ת����min д��ĸ
		System.out.println("str4 = "+str4);
		String str5=str1.replaceFirst("(?i)VBASIC", "c++");//�����ִ�Сд�滻ΪC++
		System.out.println("str1.replaceFirst() = "+str5);
		String str6=str1.replaceFirst("(?-i)VBASIC", "c++");//���ִ�Сд�滻ΪC++
		System.out.println("str1.replaceFirst() = "+str6);
		
	}

}
