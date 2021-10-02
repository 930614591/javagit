package array.setDemo;

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
        System.out.println(hashSet.size());//是无序的（存数据和取数据的顺序不一样）
        System.out.println(hashSet);

        System.out.println(hashSet.contains(10));//判断是否存在某元素


    }
}
