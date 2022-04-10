import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++)
        {
            int numbers = input.nextInt();
            if(numbers < min)
            {
                min = numbers;
            }
        }
        System.out.println(min);
    }
}
