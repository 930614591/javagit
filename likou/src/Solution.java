public class Solution {
    public static void main(String[] args) {
        int[] j={-200,-300,400,0};
        System.out.println("ok1");
        System.out.println(magicTower(j));
        System.out.println("ok");
    }
    public static int magicTower(int[] nums) {
        int hp=1;
        int n=nums.length;
int sum=0;
for(int i=0;i<n;i++){
     sum+= nums[i];
        }
if(sum<0)return -1;
        for(int i=0;i<n;){
            if((hp+nums[i])>0){
                hp+=nums[i];
                i++;
            }else{
                for(int j=i;j<n-1;j++){
                    System.out.println("*"+i+j+nums[i]+nums[j]);
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    System.out.println("#"+i+j+nums[i]+nums[j]);
                }
            }
        }
        return hp>0?1:-1;
    }

}