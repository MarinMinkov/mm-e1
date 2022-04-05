package com.company;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*       *");

        System.out.println("Enter the number of rows ");
        int treeLength = scanner.nextInt();

        int branches = 1;
        for (int i = 1; i <= treeLength; i++)
        {


            for (int j = treeLength-i; j > 0; j--)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= branches; j++)
            {
                System.out.print("*");
            }

            branches +=2;
            System.out.println();
        }

    }
}
