
public class asas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
	}
	

	public static void f1() {				
		//��д�޲η���
		f1(1,1);
		//���� �ݹ鷽��
	}
	
	public static void  f1(int i,int t) {
		//�ݹ鷽��
		System.out.print(t+"*"+i+"="+(i*t)+"\t");
		
		if(t<i) {
			t++;
			f1(i,t);
			}
		else if(i<9){
			t=1;
			i++;
			System.out.println();
			f1(i,t);
				
			}	
	}
}
