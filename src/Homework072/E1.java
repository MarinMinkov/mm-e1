package Homework072;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String input;

        input = scanner.nextLine();

        for (char n : input.toCharArray())
        {
            if (!Character.isDigit(n))
            {
                System.out.println("Error: NaN");
                break;
            }
            else
            {
                num1 = Integer.parseInt(input);
            }
        }

        input = scanner.nextLine();

        for (char n : input.toCharArray())
        {
            if (!Character.isDigit(n))
            {
                System.out.println("Error: NaN");
                break;
            }
            else
            {
                num2 = Integer.parseInt(input);
            }
        }

        if (num2 == 0)
        {
            System.out.println("Error: Division by 0.");
        }
        else
        {
            System.out.println(num1 / num2);
        }


    }

}
