package demo2;

public class Test2 {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }catch (NullPointerException e){
            System.out.println("抱歉，空指针异常");
            e.printStackTrace();
        }catch (Exception e){//通过Exception，可以捕获各类异常
            System.out.println("程序错误了");
            e.printStackTrace();
        }
        /*
        *
        * 异常的捕获机制：
        *   一般会将有可能发生异常放到try中，当程序一旦发生异常时，会自动方庄成一个该类型的异常对象
        *   然后一次根据异常类型进行catch进行匹配，若匹配到了，则会有当前catch处理，后续的catch就不再执行的，
        *   若没有匹配到作为最终会，会交给JVM来处理，终止程序打印系统封装错误
        *
        * */
        System.out.println("后续程序正在运行");
    }
}
