
public class asas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
	}
	

	public static void f1() {				
		//重写无参方法
		f1(1,1);
		//调用 递归方法
	}
	
	public static void  f1(int i,int t) {
		//递归方法
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
