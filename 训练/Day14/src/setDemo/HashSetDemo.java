package array.setDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
/*
* Set是无序且去重的
* */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建一个HshSet
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(22);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(23);
        hashSet.isEmpty();//判断是否为空
        hashSet.remove(1);//只能用元素来删除，因为没有索引
        System.out.println(hashSet.size());//是无序的（存数据和取数据的顺序不一样）
        System.out.println(hashSet);

        System.out.println(hashSet.contains(10));//判断是否存在某元素

//        遍历
        for (Integer i:hashSet) {
            System.out.println(i);
        }
//        Collections.shuffle(hashSet);


    }
}
