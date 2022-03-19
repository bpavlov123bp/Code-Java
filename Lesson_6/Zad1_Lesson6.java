import java.util.Scanner;
public class Zad1_Lesson6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double result = Math.sqrt(number);
        System.out.printf("%.5f", result);
    }
}
