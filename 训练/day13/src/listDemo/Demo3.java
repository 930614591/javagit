package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(100);
        list.add(90);
        list.add(80);
        //list是有序的，存和取得顺序一致
        System.out.println(list);

        //1.集合的基础for循环遍历
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            //System.out.println(list.get(i));
        }

        //2.集合的迭代器遍历
         Iterator<Integer> iterator= list.iterator();//将集合放入迭代器{放入一个容器中,并且每个小隔间都有指针）
//        Integer ni=iterator.next();
//        System.out.println(ni);
        while(iterator.hasNext()){
            //判断迭代器中是否有下一个元素
            System.out.println(iterator.next());
            //每次next都会返回一个当前值，并且将指针移动下一个元素
        }

        //3.集合的增强for循环 底层就是迭代器实现的，这只不过是一种简写方式
        for (int i:list){
            System.out.println(i);
        }
        /*
        * 加强for循环语法
        *   for（迭代类型 变量：可以迭代的对象）{
        *       循环体；
        *   }
        * */

    }
}
