package homework.mapDemo;

import java.util.HashMap;

/*
* 集合的另一个分支Map《k，v》映射
* Map<k,v>双列集合
* k KEY键
* v: value值
* map：存放默认是无序的（效率较高）
* 重点：HashMap<K,V>
        TreeMap<k,v>
* */
public class Test1 {
    public static void main(String[] args) {
        //1.HashMap<K,V>对象创建过程
        //new HashMap<K,V>();//K存学号 V成绩
        //存放10个学生的考试成绩，学生的学号1001~10010
        //name:小明 age：18 genfer：男
        HashMap<Integer,Float> hashMap=new HashMap<>();
        //1.map中存放元素map。put<k,v>  k无法重复，后一个值会覆盖前一个值

        hashMap.put(1001,89F);
        hashMap.put(1002,20F);
        hashMap.put(1003,69F);
        hashMap.put(1004,79F);
        hashMap.put(1005,88F);
        hashMap.put(1006,88F);
        hashMap.put(1007,90F);
        //结论：Map的Key是唯一的，当Key相同时，值会覆盖

        //2.如何获取Map中的元素  Map.get(Key)，通过键获取值
        Float so=hashMap.get(1001);
        System.out.println(so);

        //3.如何删除一个元素
        Float re=hashMap.remove(1001);//当Key不存在的时候返回null
        System.out.println(re);

        //4.判断当前映射中是否存在这个Key
        boolean bool = hashMap.containsKey(1001);
        System.out.println(bool);
        //判断映射中中是否存在当前值
        hashMap.containsValue(100F);

        hashMap.clear();//清空Map集合
        hashMap.isEmpty();//判断集合是否为空
        hashMap.size();//求集合元素的个数（键值对的个数）


        System.out.println(hashMap);
    }
}
