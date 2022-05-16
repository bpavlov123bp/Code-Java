import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args)
            throws java.io.IOException
    {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] str = lines.trim().split("\\s");
        int[] a = new int[str.length];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < str.length; i++)
        {
            a[i] = Integer.parseInt(str[i]);
            if(a[i] > max)
            {
                max = a[i];
            }
            sum += a[i];
        }
        if(sum - (2 * max) == 0)
        {
            System.out.println("Yes, sum=" + (sum - max));
        }
        else if(sum - (2 * max) != 0)
        {
            System.out.println("No, diff=" + Math.abs(sum - (2 * max)));
        }
    }
}
