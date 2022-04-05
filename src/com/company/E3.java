package com.company;


public class E3 {


    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 13;
        int s = (a + b + c) / 2;

        System.out.println("Area = " + Math.sqrt(s * (s - a) * (s - b) * (s -c)));
    }
}
