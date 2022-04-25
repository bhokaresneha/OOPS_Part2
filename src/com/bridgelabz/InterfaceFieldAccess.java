package com.bridgelabz;

interface AccessField{
    int rollno= 121;
    String name= "Sneha";
}
class Accessing implements AccessField{

}
public class InterfaceFieldAccess {
    public static void main(String[] args) {
        Accessing as = new Accessing();
        System.out.println("Interface fields . Rollno=" + as.rollno+ "name="+as.name);
    }
}