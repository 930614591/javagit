
public class SStringCutandSpingt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡ�ַ���
		String strtow="ni haoni ahini hao";
		int le=strtow.length();//��ȡ�ַ�������
		System.out.println("�ַ�������Ϊ"+le);
		int b=strtow.indexOf(" ");								//��һ���ո��λ��
		System.out.println("�ַ��е�һ�γ��ֿո��λ��������"+b);
		int e =strtow.lastIndexOf("o");							//���һ��o��λ��
		System.out.println("�ַ������һ�γ���o��λ��������"+e);
		String strb =strtow.substring(0, e);
		System.out.println(strb);
		String strb2 =strtow.substring(b+1,le);
		System.out.println(strb2);
															
																//�ÿո���
		System.out.println("��ֺ���ַ�������Ϊ��");
		String strarrry[]=strtow.split(" ");
		for(int i=0;i<strarrry.length;i++) {
			System.out.println(strarrry[i]);
		}
	}

}
