package day1;
//从某个点发生错误，查询最开始的错误点
public class Demo2FindingSpecifiedErrors {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3,2));
    }

    private static int firstBadVersion(int n, int t) {
        int left=0,right=n-1;
        while(left<=right){
            int min=left+(right-left)/2;
            if(min>t){
                right=min-1;
            }else{
                left=min+1;
            }
        }
        return  left;
    }


}

