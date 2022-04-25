package com.bridgelabz;

interface AbstactInterface{
    void PrintName();
}
abstract class AbClass implements AbstactInterface{
    abstract void PrintSurname();
    public void PrintName(){
        System.out.println("Sneha ");
    }
}
public class AbInterface extends AbClass{
    public void PrintSurname(){
        System.out.println("Bhokare");
    }

    public static void main(String[] args) {
        AbClass a1 = new AbInterface();
        a1.PrintSurname();
        a1.PrintName();
    }
}