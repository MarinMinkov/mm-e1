package com.company;

public class E6 {

    public static void main(String[] args) {

        double a = 3;
        double b = 5;
        double c = 2;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);


    }
}
