
public class StringBufferLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ַ����Ĳ���
		StringBuffer stringBuffer=new StringBuffer(8);	//����ָ�����ȵ��ַ�������������
		stringBuffer.append("abcdefg");					//��strbuff����ַ���
		System.out.println(stringBuffer.length());		//���stringbuffer�ĳ���
		System.out.println(stringBuffer.capacity());	//���stringbuffer������
		System.out.println(stringBuffer.toString()+"**");	//ת����String�ַ������
		
		 
		stringBuffer.setLength(10); 						//����stringbuffer�ĳ���Ϊ10
		System.out.println(stringBuffer.length());		//���stringbuffer�ĳ���
		System.out.println(stringBuffer.capacity());	//���stringbuffer������
		System.out.println(stringBuffer.toString()+"**");	//ת����String�ַ������
		
		stringBuffer.setLength(3); 						//����stringbuffer�ĳ���Ϊ10
		System.out.println(stringBuffer.length());		//���stringbuffer�ĳ���
		System.out.println(stringBuffer.capacity());	//���stringbuffer������
		System.out.println(stringBuffer.toString()+"**");	//ת����String�ַ������
	}

}
