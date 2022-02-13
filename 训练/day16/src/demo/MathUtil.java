package demo;

import java.util.Arrays;

public class MathUtil {
    //知识点：可变参数 语法：数据类型 变量名

    //可变参数：数组长度会根据实参数量可变
    public static int add(int...num){
        if(num.length==0){
            return 0;
        }
        int sum=0;
        for (int i:num){
            sum+=i;
        }
        System.out.println(sum);//一维数组地址num
        System.out.println(Arrays.toString(num));
        return  0;
    }

    public static void main(String[] args) {

        add();
        add(1);
        add(1,2);
        add(1,22,3,444,555,666,777,888,999);

    }
}
