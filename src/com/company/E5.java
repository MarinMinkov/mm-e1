package com.company;

import java.util.Scanner;

public class E5 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double sideA;
            double sideB;
            double sideC;

            System.out.println("Side a=");
            sideA=scanner.nextDouble();
            System.out.println("Side b=");
            sideB=scanner.nextDouble();
            System.out.println("Side c=");
            sideC=scanner.nextDouble();

            System.out.println("Perimeter = " + (sideA+sideB+sideC));

            double s = (sideA + sideB + sideC) / 2;

            System.out.println("Area = " + Math.sqrt(s * (s - sideA) * (s - sideB) * (s -sideC)));


    }
}
