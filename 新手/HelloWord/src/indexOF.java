
public class indexOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arges=[];
		System.out.println(args);
		String str= "qwqwqw";
		char ch= str.charAt(0);
		int p1=str.indexOf(ch);
		int p2=str.lastIndexOf(ch);
		if(p1>=0) {
			if (p1==p2) {
				System.out.println(str+"���ҵ��ĵ�һ���ַ�"+ch);
				
			}else {
				System.out.println(str+"����������"+ch);
			}
		}else {
			System.out.println(str+"û��"+ch);
		}

	}

}
