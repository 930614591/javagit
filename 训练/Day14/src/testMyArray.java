package array;

public class testMyArray {
    public static void main(String[] args) {
        //类似于jdk1.5版本前的ArrayList
        MyArray2 myArray2=new MyArray2();
        myArray2.add("abc");//将String上转型成Object类型
        myArray2.add(true);
        myArray2.add(12);
        myArray2.add(1.2);

        //下转型容易出现安全问题
        //泛型出现了 现在需要自定义数组升级为泛型数组
    }
}
