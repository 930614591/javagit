package com.li.demo2;

public class Juicer {
    private String name="九阳榨汁机";
    public  Juicer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void zhazhi(shuiguo shuiguo){
        System.out.println(name+"炸出了"+ shuiguo.getShuiguo()+"汁。");
    }
}
