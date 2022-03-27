import java.util.Scanner;
public class Zad5_Lesson8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        double discr = (b * b) - (4 * a * c);
        double x1 = 0.0;
        double x2 = 0.0;
        if(discr < 0)
        {
            System.out.println("The equatation has no real root!");
        }
        else if(discr > 0)
        {
            x1 = -b + Math.sqrt(discr);
            x2 = -b - Math.sqrt(discr);
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
        else if(discr == 0)
        {
            x1 = x2 = (-b) / (2 * a);
            System.out.printf("x1 = x2 = %.2f\n", x1);
        }
    }
}
