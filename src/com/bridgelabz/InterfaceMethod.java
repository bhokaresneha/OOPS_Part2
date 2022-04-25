package com.bridgelabz;


interface HelloWorld{
    int arg = 0;
    void displayName(); //default visibility is public
}
class PrintName implements HelloWorld{
    @Override
    public void displayName() {
        System.out.println("Sneha");
    }
}

public class InterfaceMethod {
    public static void main(String[] args) {
        PrintName pn = new PrintName();
        pn.displayName();
        //pn.arg;
    }
}
