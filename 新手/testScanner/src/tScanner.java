package src;
import java.util.Scanner;

public class tScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //从键盘解说i数据
        //next方式接受字符串
        System.out.println("next方式u接受字符串");
        //判断手否还有输入
        if (sc.hasNext()) {
            String str = sc.next();
            System.out.println(str);
        }
    }
}
