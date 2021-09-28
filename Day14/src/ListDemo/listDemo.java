package array.ListDemo;

import java.util.ArrayList;

public class listDemo {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        list.add("a");
        list.add("ae");

        //将a遍历删除
        for (int i = 0; i < list.size(); i++) {
            if("a".equals(list.get(i))){
                list.remove(i);
            }
        }
        ///方法一
    }
}
