import java.util.Scanner;
public class Zad1_Lesson11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int q = 1; q <= n; q++)
            {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
}
