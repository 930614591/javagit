
public class T53Targs {

	public static void main(String[] args) {
		funcB();
		
//		    TODO Auto-generated method stub
		 		 		
	}
	public static void functionA(int[] array,int k) {
		array =new int[]{6,7,8,9};
		for (int i=array.length-1;i>=0;i--)
			array[i]*=2;
		k+=5;
		System.out.println("\nk="+k);
		
	}
	
	//
	public static void funcB() {
		int[] array= {1,2,3,4};
		System.out.println("-------为传递前的元素组");
		PrintIntArray(array);
		int t=2;
		functionA(array,t);
		System.out.println("\nt="+t+"\n++++一传递后数组");
		PrintIntArray(array);
	}
	public static void PrintIntArray(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+",");
	}
	private void PringStr(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	

}
