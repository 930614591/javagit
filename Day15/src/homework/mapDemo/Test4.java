package homework.mapDemo;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //键盘输入一串内容，统计每个字符出现的字数
        /*
        *
        * 1.字符串的遍历toCharArray（），charAt（index）
        *2. Map<字符，次数>
        * a:1
        * b:2
        * c:3
        * d:4
        * 要点：map中的key天生去重
        * 3.判断map中是否存在当前字符，是加一，不存在还是一
        *
        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for (Character ch :str.toCharArray()) {
            /*if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                //map中没有此字符
                map.put(ch,1);
            }*/
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        //打印map
        for(Character ch:map.keySet()){
            System.out.println(ch+":"+map.get(ch));
        }
        sc.close();
    }
}
