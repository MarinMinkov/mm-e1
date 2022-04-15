package Homework06;

public class Exercise2 {

    //for 3 numbers.
    static double findAverage (double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
    static int findAverage (int num1, int num2, int num3)
    {
        return (num1 + num2 + num3) / 3;
    }

    //for unspecified amount of numbers.
    static double findAverage (double... nums)
    {
        double sum = 0;
        for (double n : nums)
        {
            sum += n;
        }
        return sum / nums.length;
    }


    public static void main(String[] args) {


        System.out.println(findAverage(5,6,2));
        System.out.println(findAverage(5.5,6,2));
        System.out.println(findAverage(5,6,2,5,6,7));



    }

}
