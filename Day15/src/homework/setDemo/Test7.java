package homework.setDemo;

import java.util.LinkedHashSet;
/*
* LinkedHashSet:哈希表【数组+链表/红黑树】+链表（有序是通过链表实现的）
* */
public class Test7 {
    public static void main(String[] args) {
        //1.List有序，Set是无序且去重的（只有一种set有序的）
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

    }
}
