package homework05;

public class Exercise4 {

    public static void main(String[] args) {
        int [] arr = {5,7,2,55,2,88};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            max = Math.max(arr[i],max);
        }

        System.out.println(max);
    }
}
