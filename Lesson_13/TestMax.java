import java.util.Scanner;
public class TestMax {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double max = Max(num1, num2);
        System.out.printf("The max number between %.2f and %.2f is: %.2f!", num1, num2, max);
    }
    public static double Max(double num1, double num2)
    {
        double result = 0.0;
        if(num1 > num2)
        {
            result = num1;
        }
        else
        {
            result = num2;
        }
        return result;
    }
}
