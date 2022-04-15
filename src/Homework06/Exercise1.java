package Homework06;

public class Exercise1 {

    static double findMin (double num1, double num2, double num3)
    {
        double min=num1;

        min = Math.min(min, num2);
        min = Math.min(min,num3);
        return min;
    }
    static int findMin (int  num1, int num2, int num3)
    {
        int min=0;
        if (num1 < num2 && num1 < num3)
        {
            min = num1;
        }
        if (num2 < num1 && num2 < num3)
        {
            min = num2;
        }
        if (num3 < num1 && num3 < num2)
        {
            min = num3;
        }
        return min;
    }

    public static void main(String[] args) {

        System.out.println(findMin(2,3,4));
        System.out.println(findMin(2.5,3.5,4.5));

    }
}
