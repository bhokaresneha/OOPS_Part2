package com.bridgelabz;

abstract class Circle{
    double pi = 3.14;
    int r = 4;
    abstract void AreaOfCircle();
}
abstract class Rectangle extends Circle{
    int len = 4;
    int bre = 5;
    abstract void AreaOfRectangle();
}
public class Shape extends Rectangle {
    void AreaOfCircle(){
        System.out.println("Area Of Circle is " + pi * r * r );
    }
    void AreaOfRectangle(){
        System.out.println("Area Of Rectangle is " + len * bre );
    }

    public static void main(String[] args) {
        Rectangle r = new Shape();
        r.AreaOfRectangle();
        Circle c = new Shape();
        c.AreaOfCircle();

    }

}