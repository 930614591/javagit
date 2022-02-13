package Day2;

import java.util.Arrays;

//Rotate the array旋转数组
/*给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

 

进阶：

尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？

*/
public class Demo2RotateTheArray {
    public static void main(String[] args) {
        int[] z={1,2,3,4,5,6,7};
        System.out.println(z);
        rotate(z,3);
        System.out.println();
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] newArr=new int[n];
        // int f=k%n;
        for(int i=0;i<n;i++){
            newArr[(k+i)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=newArr[i];
        }
    }
}
