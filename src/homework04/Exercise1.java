package homework04;

import java.util.Scanner;

public class Exercise1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "The ";
        System.out.println("Enter the number of the week day");
        int dayNum;
        String input;
        boolean isDayOfWeek;
        while (true)
        {
            try
            {
                dayNum = scanner.nextInt();
                if (dayNum > 0 && dayNum < 8)
                {
                    isDayOfWeek = true;
                    break;
                }
                else
                {
                    System.out.println("Please enter a number from 1 to 7");
                }
            }
            catch (Exception e)
            {
                System.out.println("Please enter a number from 1 to 7");
                scanner.nextLine();
            }

        }
        switch (dayNum)
        {
            case 1:
                message+= String.format("%dst day of the week is Monday.", dayNum);
                break;
            case 2:
                message+= String.format("%dnd day of the week is Tuesday.", dayNum);
                break;
            case 3:
                message+= String.format("%drd day of the week is Wednesday.", dayNum);
                break;
            case 4:
                message+= String.format("%dth day of the week is Thursday.", dayNum);
                break;
            case 5:
                message+= String.format("%dth day of the week is Friday.", dayNum);
                break;
            case 6:
                message+= String.format("%dth day of the week is Saturday.", dayNum);
                break;
            case 7:
                message+= String.format("%dth day of the week is Sunday.", dayNum);
                break;
            default:
                System.out.println("Error");
                isDayOfWeek = false;
        }

        if (isDayOfWeek)
        {
            System.out.println(message);
        }

    }
}
