import java.util.Scanner;
import java.math.*;
public class Zad4_Lesson12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter interes rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter years: ");
        int years = input.nextInt();
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        System.out.printf("The future value of amount %.2f lv in %d years is %.2f", amount, years,
                Invest(amount, years, rate));
    }
    public static double Invest(double amount, int year, double interestRate)
    {
        double futureValue = amount * (Math.pow(1 + (interestRate / 100.0), year));
        return futureValue;
    }
}
