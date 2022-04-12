package homework05;

import java.util.*;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a palindrome:");
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();

        //Method 1.
        for (int i = 0; i < userInput.length()/2; i++)
        {
            if (i == userInput.length() / 2 -1)
            {
                System.out.println("The word is a palindrome.");
                break;
            }
            if (userInput.charAt(i) != userInput.charAt(userInput.length() - 1 - i))
            {
                System.out.println("The word is not a palindrome.");
                break;
            }
        }


        //Method 2.
        ArrayList <Character> text = new ArrayList<>();
        ArrayList <Character> reverseText = new ArrayList<>();

        for (char n: userInput.toCharArray())
        {
            text.add(n);
            reverseText.add(n);
        }
        Collections.reverse(reverseText);

        if (text.equals(reverseText))
        {
            System.out.println("The word is a palindrome.");
        }
        else
        {
            System.out.println("The word is not a palindrome.");
        }
    }
}
