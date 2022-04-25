import java.util.Scanner;
import static java.lang.Math.random;
public class TheMatrix {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix row: ");
        int matrixRow = input.nextInt();
        System.out.print("Enter matrix colmun: ");
        int matrixCol = input.nextInt();
        int[][] A = new int[matrixRow][matrixCol];
        int[][] B = new int[matrixRow][matrixCol];
        int[][] sumMatrix = new int[matrixRow][matrixCol];

        for(int i = 0; i < matrixRow; i++)
        {
            for(int j = 0; j < matrixCol; j++)
            {
                A[i][j] = input.nextInt();

            }
        }
        System.out.println("Matrix A");
        for(int i = 0; i < matrixRow; i++)
        {
            for(int j = 0; j < matrixCol; j++)
            {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < matrixRow; i++)
        {
            for(int j = 0; j < matrixCol; j++)
            {
                B[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix B");
        for(int i = 0; i < matrixRow; i++)
        {
            for(int j = 0; j < matrixCol; j++)
            {
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix sumMatrix");
        for(int i = 0; i < matrixRow; i++)
        {
            for(int j = 0; j < matrixCol; j++)
            {
                //sumMatrix[i][j] = 0;
                sumMatrix[i][j] = A[i][j] + B[i][j];
                System.out.printf("%4d", sumMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
