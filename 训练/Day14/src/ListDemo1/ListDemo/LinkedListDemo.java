package array.ListDemo1.ListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    /*
    * 频繁删除添加元素时建议使用LinkedList
    * */
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();//1.7后就可以不谢泛型
        //LinkedList是通过Deque（双端队列），来实现的，（双向链表）可以从两端增删改查
        //1.追加方式放置列表元素
        list.add(1);
        list.add(12);
        list.add(2);
        list.addFirst(11);//表示从链表头添加元素
        list.addLast(888);//从链表尾巴插入元素
        //Integer i=list.pop();
        System.out.println(list);
       /* //2.删除方法
        list.remove(0);//不加参数就是从头删除
        list.remove();//删除原理，先查到再删除
        list.removeFirst();//从链表头删除
        list.removeLast();//从链表尾巴删除

        //System.out.println(i);

        System.out.println(list);

        //常用方法
        list.clear();//清空集合
        list.size();//求集合长度
        list.contains(3);//判断是否包含某个元素
        System.out.println(list);
        */

        //遍历
        list.get(1);//Linkedlist从链表头设定索引为0（线性双向量表）底层是由双端队列Deque实现的

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //迭代器遍历
        //创建迭代器对象
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            //hasNext（）判定下一个是否为空
            System.out.println(iterator.next());//打印下一个
        }

    }
}
