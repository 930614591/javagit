package homework.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*
* HashMap底层是哈希表
* 哈希表：散列表
*       基于Hash算法的
*
* */

public class Tset6 {
    public static void main(String[] args) {
        HashMap<Integer,Float> hashMap=new HashMap<>();
        //1.map中存放元素map。put<k,v>  k无法重复，后一个值会覆盖前一个值

        hashMap.put(1001,89F);
        hashMap.put(1002,20F);
        hashMap.put(1003,69F);
        hashMap.put(1004,79F);
        hashMap.put(1005,88F);
        hashMap.put(1006,88F);
        hashMap.put(1007,90F);
        //Map内部还有一个接口Entry<k,v>键值对getKey（） getValue（）
        //2.Map的遍历（重点掌握）
        Set<Map.Entry<Integer,Float>> entrySet= hashMap.entrySet();     //将左右的Entry《k，v》放到set集合中
        for(Map.Entry<Integer,Float> entry:entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        for (Integer key:hashMap.keySet()){
            System.out.println(key+":"+hashMap.get(key));
        }
    }
}
