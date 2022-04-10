import java.util.Scanner;
public class LeftAndRightSum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= n; i++)
        {
            int numbers = input.nextInt();
            sum1 += numbers;
        }
        for(int q = 1; q <= n; q++)
        {
            int number = input.nextInt();
            sum2 += number;
        }
        if(sum1 == sum2)
        {
            System.out.println("Yes, sum = " + sum1);
        }
        else
        {
            System.out.println("No, diff = " + Math.abs(sum1 - sum2));
        }
    }
}
