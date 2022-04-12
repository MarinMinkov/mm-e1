package homework05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <ArrayList <Integer>> dynamicMatrix = new ArrayList<ArrayList <Integer>>();
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        for (int i = 0; i < rows; i++)
        {
            dynamicMatrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++)
            {
                System.out.print("Enter element [" + i + "," + j + "]:");
                dynamicMatrix.get(i).add(scanner.nextInt());
            }

        }
        // Print method 1.
        for (int i = 0; i < dynamicMatrix.size(); i++)
        {
            for (int j = 0; j < dynamicMatrix.get(i).size(); j++)
            {
                System.out.print(dynamicMatrix.get(i).get(j) + " ");
            }

            System.out.println();
        }
        // Print method 2.
        for (int i = 0; i < dynamicMatrix.size(); i++) {
            System.out.println(dynamicMatrix.get(i));
        }

    }
}
