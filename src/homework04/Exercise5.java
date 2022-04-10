package homework04;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dayBudget;
        String destination;
        System.out.println("Enter your daily budget (Per person):");
        dayBudget = scanner.nextInt();
        System.out.println("Enter destination Beach / Mountain");
        scanner.nextLine(); // Clear the scanner buffer.
        while (true)
        {
            destination = scanner.nextLine();
            destination = destination.toLowerCase();
            if (!destination.equals("beach") && !destination.equals("mountain"))
            {
                System.out.println("There is no information about this type of vacation");
            }
            else
            {
                if (destination.equals("beach"))
                {
                    if (dayBudget<50)
                    {
                        System.out.println("We recommend a vacation in Bulgaria.");
                    }
                    else
                    {
                        System.out.println("We recommend vacation outside Bulgaria.");
                    }
                    break;

                }
                else if (destination.equals("mountain"))
                {
                    if (dayBudget<30)
                    {
                        System.out.println("We recommend a vacation in Bulgaria.");
                    }
                    else
                    {
                        System.out.println("We recommend vacation outside Bulgaria.");
                    }
                    break;
                }
                else
                {
                    System.out.println("Error!");
                }
            }
        }

    }
}
