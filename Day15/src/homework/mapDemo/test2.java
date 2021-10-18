package homework.mapDemo;

import java.util.HashMap;
import java.util.Set;

public class test2 {
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
        //2.Map能否直接遍历
        Set<Integer> keyset= hashMap.keySet();//将Map集合中的所有键存放到Set集合中（去重）
        //遍历的思路：通过每一个Key，使用Map.get（Key）来获取Kay所对应的value
        for(Integer key:keyset){
            Float value=hashMap.get(key);
            System.out.println(key+":"+value);
        }
    }
}
