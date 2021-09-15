package day1;
//在按顺序排列的数组中，插入一个数字到合适位置，搜索插入位置
public class Demo3SearchForInsertionPosition {
    public static void main(String[] args) {
    int[] i={1,3,5,6};
        System.out.println(searchInsert(i,7));
    }
    public static int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        //if(target>)
        while (left<=right){
            int min=left+(right-left)/2;
            if(nums[min]==target)return min;
            if(nums[min]>target){
                right=min-1;
            }else if (nums[min]<target){
                left=min+1;
            }
        }
        return left;
    }
}
