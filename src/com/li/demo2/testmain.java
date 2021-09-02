package com.li.demo2;

public class testmain {
    public static void main(String[] args) {
        Juicer juicer=new Juicer("九阳榨汁机");
        shuiguo shuiguo=new shuiguo("苹果");
        shuiguo shuiguo2=new shuiguo("梨");
        juicer.zhazhi(shuiguo);
        juicer.zhazhi(shuiguo2);

    }
}
