import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {
																		// TODO Auto-generated method stub
		// Creates and initializes the array ArrayEx
		int arrayex[]= {25,63,27,-17,39,46,79,2,89,13};
		//output string information and the value of ArrayEx
		System.out.print("排序前为：\narrayex[]={"+arrayex[0]);
		for(int i=1;i<arrayex.length;i++){
			System.out.print(","+arrayex[i]);
		}
		System.out.println("}");
		System.out.println("未排序数组中查找27的位置："+Arrays.binarySearch(arrayex, 27));
		Arrays.sort(arrayex);
		System.out.println("排序后数组中查找27的位置："+Arrays.binarySearch(arrayex, 27));
		System.out.print("排序后为：\narrayex[]={"+arrayex[0]);
		for(int i=1;i<arrayex.length;i++){
			System.out.print(","+arrayex[i]);
		}
		System.out.println("}");
	}

}
