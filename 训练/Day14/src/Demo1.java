package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        list.add("a");
        list.add("z");
        //将集合中的a删除
        //一、用for遍历的方式删除
        /*for (int i = 0; i < list.size(); i++) {
            if("a".equals(list.get(i))){
                list.remove(i);
            }
        }
        System.out.println(list);*/
        //二、能否通过迭代器删除
        Iterator<String> iterator=list.iterator();//转换成迭代器对象
        /*while (iterator.hasNext()){//迭代器删除
            //判断迭代器中是否有下一个对象
            if("a".equals(iterator.next())){
                iterator.remove();
            }
            System.out.println(list);
        }*/

        //三、并发修改异常解决方案
//        while (iterator.hasNext()){
//            String str=iterator.next();
//            if ("a".equals(str)){
//                list.remove(str);
//                /*Exception in thread "main" java.util.ConcurrentModificationException
//	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//	并发修改异常
//	*/
//            }
//        }
        //解决方案
        ListIterator<String> listIterator=list.listIterator();
        /*while(listIterator.hasNext()){
            //判断迭代器中是否有元素
            String str=listIterator.next();
            if ("a".equals(str)){
                listIterator.remove();//list.remove(str);//并发修改异常
            }
        }*/

        //四、能否用加强for循环来删除元素呢 for each 循环
        /*for (String str:list ) {
            if ("a".equals(str)){
                list.remove(str);//会出现并发修改异常，因为底层是迭代器
            }
        }*/
        System.out.println(list);

    }
}
