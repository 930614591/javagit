package array.ListDemo1.ListDemo;

import java.util.Vector;
/*
* ArrayList 与 LinkeList、Vector之间的区别和联系
* */
public class VectorDemo {
    public static void main(String[] args) {
        //1.老集合（安全的）底层是数组
        Vector<Integer> vector =new Vector<Integer>();
        vector.add(1);
        vector.add(34);System.out.println(vector.size());
        vector.remove(0);

        System.out.println(vector.get(0));
        System.out.println(vector.size());

    }
}
