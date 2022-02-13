package src;

import java.util.Scanner;

public class t2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            String str2=new String(sc.nextLine());
            System.out.println(str2);
        }
    }
}
