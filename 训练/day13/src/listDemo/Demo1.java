package listDemo;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //1.jkd1.5版本时候的集合
        ArrayList  list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("1");
       // System.out.println(list.toString());
        //1. 查看集合中的元素
        System.out.println(list);
      //  System.out.println(list.size());
//        list.get()
        //2.获取指定索引处元素的集合list.get(index)
        Object obj=list.get(3);
        if (obj instanceof  Integer){
            int num=(Integer)obj;
            System.out.println(num*100);
        }
        Integer n=(Integer) list.get(1);//类型转换异常 下转型
        //工作中：集合推荐大家使用同一种数据类型
        //为了解决下转型带来的安全问题，在1.5版本提出了全新的概念，泛型：
        //泛型：表示广泛的类型（通用类型的规范）
        //语法： <任意类型><t=T><E><K,V>当自己定义泛型时建议用大写

    }
}
