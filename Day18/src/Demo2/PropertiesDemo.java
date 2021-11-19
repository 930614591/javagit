package Demo2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        //Properties 属性文件类 key=value
        Properties properties=new Properties();//底层就是Hashtable
        //1.存数据（Properties来说K，V都是字符串String）
        properties.setProperty("gender","男");
        //2.如何通过key来获取到value
        String gender=properties.getProperty("gender");
        System.out.println(gender);


        //Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();//线程安全的，不可空键，不可以存放空值
        HashMap<Integer,String> hashMap=new HashMap<>();//非线程安全的，可以存放空键空值 非线程安全的
        hashMap.put(null,"");
        hashMap.put(1,null);
    }
}
