import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i <= n; i++)
        {
            int numbers = input.nextInt();
            if(i % 2 == 0)
            {
                sumEven += numbers;
            }
            else
            {
                sumOdd += numbers;
            }
        }
        if(sumEven == sumOdd)
        {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        }
        else
        {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
