package demo2;
//异常处理
/*
*
* 异常：程序在运行过程中出现的一些不正常的现象叫做异常
* 危害：终止程序的运行
* 按照危害程度，java中吧一场分为两大类：Exceotion（异常）、Error（错误）
* Exceotion（异常）：可以通过异常的处理机制避免
* Error（错误）：是严重级别的一场，是程序无法控制的（一定不要再设计的时候出现错误）
*       HeapOverLowError    StackOverLowError  虚拟机中断
* 重点：异常的处理机制
*       捕获机制
*           try{
*               有可能会出现异常的代码
*               }catch（g根据异常类型 变量）{
*                   //根据不同类型的异常，来做不同的应对策略
*               }finally{
*                   //无论如何都会执行的部分
* //常用来释放资源
*               }
*
 *
* */
public class Test {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;//运行期产生的异常（非受查异常）
            //受查异常：代码错误
        }catch (ArithmeticException e){
            e.printStackTrace();//异常在栈中的轨迹
            System.out.println(e+"数值错误");
        }

    }
}
