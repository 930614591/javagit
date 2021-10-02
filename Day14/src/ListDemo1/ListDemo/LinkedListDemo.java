package array.ListDemo1.ListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();//1.7后就可以不谢泛型
        //LinkedList是通过Deque（双端队列），来实现的，（双向链表）可以从两端增删改查
        //1.追加方式放置列表元素
        list.add(1);
        list.add(12);
        list.add(2);
        list.addFirst(11);//表示从链表头添加元素
        list.addLast(888);//从链表尾巴插入元素
        System.out.println(list);
        //2.删除方法
        list.remove(0);//不加参数就是从头删除
        list.remove();//删除原理，先查到再删除
        System.out.println(list);
    }
}
