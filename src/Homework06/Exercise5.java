package Homework06;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {

    //Reused code from Homework05 Exercise7

    static boolean numIsPalindrome (int num) {

        if (num < 0) // making sure negative numbers are not processed.
        {
            return false;
        }

        String userInput = String.valueOf(num);
        //Method 1.
        if (userInput.length() == 1) {
            return true;
        }
        for (int i = 0; i < userInput.length() / 2; i++) {
            if (i == userInput.length() / 2 - 1) {
                return true;
            }
            if (userInput.charAt(i) != userInput.charAt(userInput.length() - 1 - i)) {
                return false;
            }
        }
        return false;
    }
    static boolean numIsPalindromeAlternate (int num)
    {
        if (num < 0) // making sure negative numbers are not processed.
        {
            return false;
        }
        String userInput = String.valueOf(num);
        //Method 2.
        ArrayList<Character> text = new ArrayList<>();
        ArrayList <Character> reverseText = new ArrayList<>();

        for (char n : userInput.toCharArray())
        {
            text.add(n);
            reverseText.add(n);
        }
        Collections.reverse(reverseText);

        if (text.equals(reverseText))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(numIsPalindrome(5));
        System.out.println(numIsPalindrome(121));
        System.out.println(numIsPalindrome(3443));
        System.out.println(numIsPalindrome(123454321));
        System.out.println(numIsPalindrome(1234543212));
        System.out.println(numIsPalindrome(1234554321));
        System.out.println(numIsPalindrome(1023454321));


        System.out.println();



        System.out.println(numIsPalindromeAlternate(5));
        System.out.println(numIsPalindromeAlternate(121));
        System.out.println(numIsPalindromeAlternate(3443));
        System.out.println(numIsPalindromeAlternate(123454321));
        System.out.println(numIsPalindromeAlternate(1234543212));
        System.out.println(numIsPalindromeAlternate(1234554321));
        System.out.println(numIsPalindromeAlternate(1023454321));
    }
}
