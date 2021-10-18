package homework.mapDemo;

import java.util.HashMap;

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
    }
}
