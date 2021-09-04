package array;

public class Test {
    public static void main(String[] args) {
        String[] str=new String[100];
        //数组是定长的 一旦创建后，长度就直接确定了

        MyArray arr=new MyArray();//通过无参创建出的自定义数组长度默认10
        MyArray brr=new MyArray(100);
        arr.add("as");
        arr.add("as");
        arr.add("as");
        arr.add("as");
        arr.add("as");
        arr.add("a213s");
        arr.add("as");
        arr.add("as");
        arr.add("a23s");
        arr.add("as");
        arr.add("as");
        arr.add("a123s");
        arr.add("as");
        arr.add("中国");
        System.out.println(arr.display());

        //arr.get(100);
        arr.update(0,"上海");
        System.out.println(arr.display());
        arr.remmov(0);
        System.out.println(arr.display());
        System.out.println(arr.size());
        System.out.println(arr.indexOf("a123s"));
        System.out.println(arr.count("as"));
        arr.shuffle();
        System.out.println(arr.display());
        arr.reverse();
        System.out.println(arr.display());

    }
}
