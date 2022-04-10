package homework04;

public class Exercise6 {

    public static void main(String[] args) {

        int [] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < list1.length; i++)
        {
            if (list1[i] > 150)
            {
                break;
            }
            else
            {
                if (list1[i]%5==0)
                {
                    System.out.println(list1[i]+" ");
                }
            }
        }

    }
}
