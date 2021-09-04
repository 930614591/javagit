
public class T506Sort1Bnbble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* as */
		int[] a= {1,5,2,8,0,6,88,77,99,22,1,55,33,44,66,8888,66454,555,445,444};
		//BubbleSortInt(a);//调用冒泡排序  
		InsertionSort(a);//调用插入排序
	}
	
	//冒泡排序
	public static void BubbleSortInt(int[] array) {
		for(int n=0;n< array.length;n++) {
			for(int t=0;t< array.length-n-1;t++) {//寻找最大的数
				if( array[t]> array[t+1]) {
					int temp=0;
					temp= array[t];
					 array[t]= array[t+1];
					 array[t+1]=temp;//
				}
			}
		}
		T53Targs.PrintIntArray(array);
	}
	//
	
	//插入排序
	public static void InsertionSort(int[] array) {
		for(int t=0;t<array.length;t++) {
			for(int z=t;z>0;z--) {
				if(array[z]<array[z-1]) {
					int temp=0;
					temp= array[z];
					 array[z]= array[z-1];
					 array[z-1]=temp;
					} /*
						 * System.out.println(); T53Targs.PrintIntArray(array);//测试具体执行过程
						 */
			}

		}
		System.out.println();
		T53Targs.PrintIntArray(array);
	}////////////////
	
	
	
	

}
