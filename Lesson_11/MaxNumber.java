import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++)
        {
            int numbers = input.nextInt();
            if(numbers > max)
            {
                max = numbers;
            }
        }
        System.out.println(max);
    }
}
