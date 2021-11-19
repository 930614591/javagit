package Demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
* 属性文件的加载
*
* */
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        //1.创建一个属性文件对象
        Properties properties=new Properties();
        //2.加载属性文件 读取到properties中
        FileInputStream fileInputStream=new FileInputStream("day18/src/demo2/info.properties");
        properties.load(fileInputStream);
        //3.通过键来验证那个数据
        String name= properties.getProperty("name");
        System.out.println(name);
    }
}
