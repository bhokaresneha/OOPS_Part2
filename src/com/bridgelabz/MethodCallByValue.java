package com.bridgelabz;

public class MethodCallByValue {
            int a = 10;
        void Add(int a) {
            a = a+10;
        }

        public static void main(String[] args) {

            MethodCallByValue mcv = new MethodCallByValue();
            System.out.println("Before call-by-value: " + mcv.a);
            mcv.Add(20);
            System.out.println("After call-by-value: " + mcv.a);


        }

    }

