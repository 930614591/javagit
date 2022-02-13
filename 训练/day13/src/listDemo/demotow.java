package listDemo;

import java.util.ArrayList;
/*
* 泛型的作用
*   将类型的检查1从运行期提前到了编译期：有效地解决了下转型的安全隐患
* */
public class demotow {
    public static void main(String[] args) {
        //1.jdk1.5之后解决了下转型的安全隐患
        ArrayList<Integer> list=new ArrayList<Integer>();//当前这个集合只能存放int类型数据
        //1.像集合中追加元素
        list.add(1);
        list.add(2);
        list.add(3);
        //指定位置插入元素，实现重载
        list.add(2,999);
        //list.add("1");
        //2. 查看集合元素个数
        System.out.println(list.size());
        //。3、像集指定位置合中覆盖元素
        list.set(1,998);
        System.out.println(list);
        //。4.删除元素
        list.remove(0);//索引优先删除
        System.out.println(list);
        //list.remove("998");
    }
}
