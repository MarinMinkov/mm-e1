package Homework072;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        try
        {
            num1 = scanner.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("You have to enter a number.");
        }
        try
        {
            num2 = scanner.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("You have to enter a number.");
        }
        try
        {
            System.out.println(num1/num2);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error.");
        }


    }

}
