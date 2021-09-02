package com.li.demo1;

public class a1 {
    int a = 1;
    int b = 2;

    public a1(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "a1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
