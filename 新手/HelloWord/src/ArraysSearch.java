import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {
																		// TODO Auto-generated method stub
		// Creates and initializes the array ArrayEx
		int arrayex[]= {25,63,27,-17,39,46,79,2,89,13};
		//output string information and the value of ArrayEx
		System.out.print("����ǰΪ��\narrayex[]={"+arrayex[0]);
		for(int i=1;i<arrayex.length;i++){
			System.out.print(","+arrayex[i]);
		}
		System.out.println("}");
		System.out.println("δ���������в���27��λ�ã�"+Arrays.binarySearch(arrayex, 27));
		Arrays.sort(arrayex);
		System.out.println("����������в���27��λ�ã�"+Arrays.binarySearch(arrayex, 27));
		System.out.print("�����Ϊ��\narrayex[]={"+arrayex[0]);
		for(int i=1;i<arrayex.length;i++){
			System.out.print(","+arrayex[i]);
		}
		System.out.println("}");
	}

}
