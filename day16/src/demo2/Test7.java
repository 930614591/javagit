package demo2;

public class Test7 {
    public static void main(String[] args) {
        int age=-1;
        checkAge(age);
    }
/*
*自定义异常extends Exception 在抛出时throw必须在方法上声明throws异常或在内部捕获
* 自定义异常extends   RuntimeException在抛出是，无需再方法上声明throws异常（主流方式0)
* */
    public static boolean checkAge(int age){
        if(age<0 || age>250){
            throw new AgeException("年龄非法");//自定义异常不需要try
        }
        return  true;
    }
}
