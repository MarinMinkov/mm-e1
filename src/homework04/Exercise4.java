package homework04;

public class Exercise4 {

    public static void main(String[] args) {
        int [] arr = {5,2,67,33,12,8,9};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
