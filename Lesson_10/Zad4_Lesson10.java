import java.util.Scanner;
public class Zad4_Lesson10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = n; row >= 1; row--)
        {
            for(int col = 1; col <= n - row; col++)
            {
                System.out.print(" ");
            }
            System.out.print("#");
            for(int col = 1; col < row; col++)
            {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
}
