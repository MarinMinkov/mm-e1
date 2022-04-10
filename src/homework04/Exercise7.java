package homework04;

public class Exercise7 {

    public static void main(String[] args) {
        int [] list1 = {10, 20, 30, 40, 50};
        int [] list2 = new int[list1.length];

        for (int i = 0; i < list1.length-1; i++)
        {
            list2[i] = list1[list1.length - i - 1];
        }

        for (int n : list2)
        {
            System.out.println(n + " ");
        }
    }
}
