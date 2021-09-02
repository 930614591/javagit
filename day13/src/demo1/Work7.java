package demo1;

public class Work7 {
    public static  final float PI=3.1415f;
    public static void main(String[] args) {

        String result=String.format("圆周率:%f",PI);
        float percent=0.67f;
        System.out.println(result);

        System.out.println(String.format("百分比为：%f%%",percent*100));

        float perce=9.98f;
        System.out.println(String.format("单价为：%.1f",perce));//会四舍五入
    }
}
