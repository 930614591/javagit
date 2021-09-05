package listDemo;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //1.jkd1.5版本时候的集合
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       // System.out.println(list.toString());
        //1. 查看集合中的元素
        System.out.println(list);
      //  System.out.println(list.size());
//        list.get()
        //2.获取指定索引处元素的集合list.get(index)
        Object obj=list.get(3);
        System.out.println(obj);
    }
}
