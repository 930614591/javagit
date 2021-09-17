package day1;
//二分法搜索一个值
import static day1.Solution.search;

public class Demo1BinarySearch {
    public static void main(String[] args) {
        int [] e={-1,0,3,5,9,12};
        System.out.println(search(e,9));
    }
}
class Solution {
    public static int search(int[] nums, int target) {
        int right=nums.length-1,left=0;//low表示起始位置，length1表示检索长度
       while(left<=right){
           int min=left+(right-left)/2;//确定中点位置

           if(target==nums[min]){//判断中点的值
               return min;
           }else if(target<nums[min]){
               right=min-1;//如果中点比值小，那么就把检索长度设定为一般
           }else{
               left=min+1;//如果中点比值大，就设起始位置为一半
           }
       }
        return -1;
    }
}
