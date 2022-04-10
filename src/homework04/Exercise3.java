package homework04;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        double price, total, discountPercent, discount;

        System.out.println("Enter unit price:");
        price = scanner.nextInt();
        System.out.println("Enter quantity");
        quantity = scanner.nextInt();

        if (quantity<=100)
        {
            discountPercent = 1;
        }
        else if (quantity > 100 && quantity <= 120)
        {
            discountPercent = 0.15;
        }
        else if (quantity>120)
        {
            discountPercent = 0.2;
        }
        else
        {
            discountPercent = 1;
        }

        total = quantity * price;
        discount = quantity * price * discountPercent;


        System.out.printf("The revenue from sale: %.1f$%n", total - discount);
        System.out.printf("Discount: %.1f$(%.1f%%)",discount,discountPercent * 100);

    }
}
