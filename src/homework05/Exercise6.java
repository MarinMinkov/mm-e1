package homework05;

public class Exercise6 {

    public static void main(String[] args) {

        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            leftDiagonalSum += matrix[i][i];
        }

        for (int i = matrix.length-1; i >= 0 ; i--)
        {
            rightDiagonalSum += matrix[i][i];
        }

        System.out.println(leftDiagonalSum);
        System.out.println(rightDiagonalSum);
    }
}
