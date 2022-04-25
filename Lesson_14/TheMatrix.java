import java.util.Scanner;
import static java.lang.Math.random;
public class TheMatrix {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter range of matrix: ");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] sumMatrix = new int[n][n];
        System.out.println("Matrix A");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                A[i][j] = (int)(20 * random() - 9);
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix B");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                B[i][j] = (int)(20 * random() - 9);
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix sumMatrix");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                //sumMatrix[i][j] = 0;
                sumMatrix[i][j] = A[i][j] + B[j][j];
                System.out.printf("%4d", sumMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
