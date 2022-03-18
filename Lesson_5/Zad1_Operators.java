import java.util.Scanner;
import java.math.*;
public class Zad1_Operators {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double result = Math.sqrt((x * x) + (y * y));
        System.out.printf("%.2f", result);
    }
}
