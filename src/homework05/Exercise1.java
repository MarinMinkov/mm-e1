package homework05;

import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {
        int [] arr = {5,7,2,55,2,88};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
