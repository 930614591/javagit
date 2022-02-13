package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>lise= new ArrayList<>();
        lise.add(1);
        lise.add(2);

        ArrayList<Integer>lise2= new ArrayList<>();

        lise2.add(11);
        lise2.add(22);

        lise.addAll(lise2);//lise扩容了，合并了lise2中的数据
        System.out.println(lise);
        System.out.println(lise2);
    }
}
