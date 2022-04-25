package com.bridgelabz;

public class MethodCallingyRef {
    int a = 10;
    void add(MethodCallingyRef b)
    {
        b.a=b.a+10;
    }

    public static void main(String  [] args) {
        MethodCallingyRef mcf = new MethodCallingyRef();
        System.out.println("Before calling by Ref " + mcf.a);
        mcf.add(mcf);
        System.out.println("After calling by Ref " + mcf.a);

    }
}