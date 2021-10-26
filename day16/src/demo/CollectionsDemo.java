package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
*
* collection:集合接口
* Collections：集合工具类
*
* */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(22);
        list.add(33);
        //1.sui随机元置换shuffle
        Collections.shuffle(list);//直接打乱堆中对象的数据

        //向集合容器中一次性添加数据
        Collections.addAll(list,70,80,40,50,60);
        System.out.println(list);
        //3.排序（默认类的排序规则）
        Collections.sort(list);
        System.out.println(list);
        //4.想要一个降序的结果
        Comparator<Integer> comparator= new Comparator<>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Collections.sort(list,comparator);
        System.out.println(list);


        //5.二分查找,返回所在的下标（默认升序，否则都是错的）
        int index=Collections.binarySearch(list,50);
        System.out.println(index);

        //6.反转集合元素
        Collections.reverse(list);
        System.out.println(list);

        //7.可以是ArrayList和Linklist线程安全
        Collections.synchronizedList(list);
        System.out.println(list);

    }
}
