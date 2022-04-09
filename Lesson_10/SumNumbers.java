import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            int nums = input.nextInt();
            sum += nums;
        }
        System.out.println(sum);
    }
}
