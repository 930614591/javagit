package Day2;

public class Demo1SquareSorting {
    public static void main(String[] args) {
        int [] z={-4,-1,0,3,10};
        System.out.println(sortedSquares(z));
    }
    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] temp2=new int[n];
        for(int i=0;i<n;i++){
            nums[i]*=nums[i];
            /*for(int j=0;j<n-1;j++){
                if(temp2[j]>temp2[j+1]){
                    int temp=temp2[j];
                    temp2[j]=temp2[j+1];
                    temp2[j+1]=temp;
                }
            }*/
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return temp2;
    }
}
