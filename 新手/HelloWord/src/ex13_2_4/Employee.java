package ex13_2_4;

public class Employee {
	static String nameString;//����String���͵�������
	static int age;//chuangjian����int���͵�������age
	final static int LEN=8;//��������ʼ����̬
	public Employee(String nameString,int age) {
		if(nameString.length()>LEN) {
			nameString=nameString.substring(0, 8);//��ȡ�ַ��������ַ���
		}else {
			while (nameString.length()<LEN) {
				nameString=nameString+"\u0000";
			}
		}
		this.nameString=nameString;//��ʼ��namestring
		this.age=age;//��ʼ��age
	}
	//���ڷ���name
	public static String getName() {
		return nameString;
	}
	//���ڷ���age
	public static int getAge() {
		return age;
	}
	//����name
	public void setName(String nameString) {
		this.nameString=nameString;//�޸�name������
	}
	//����age
	public void setAge(int age) {
		this.age=age;//�޸�age��ֵ
		
	}
	//huoqulei��ȡ���ռ�ÿռ�
	public static int size() {
		return 2*8+4;//�ַ��������ǰˣ�һ���ַ�ռ�������ֽڣ�һ������ռ�����ֽ�
		
	}
}
