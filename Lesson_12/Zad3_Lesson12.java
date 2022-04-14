import java.util.Scanner;
public class Zad3_Lesson12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter figure: ");
        String figure = input.nextLine();
        if(figure.equalsIgnoreCase("triangle"))
        {
            System.out.printf("Enter one side of %s: ", figure);
            double a = input.nextDouble();
            System.out.printf("Enter height of %s: ", figure);
            double h = input.nextDouble();
            System.out.printf("The area of %s is %.2f", figure, triangle(a, h));
        }
        else if(figure.equalsIgnoreCase("rectangle"))
        {
            System.out.printf("Enter one side of %s: ", figure);
            double a = input.nextDouble();
            System.out.printf("Enter second side of %s: ", figure);
            double b = input.nextDouble();
            System.out.printf("The area of %s is %.2f", figure, rectangle(a, b));
        }
        else if(figure.equalsIgnoreCase("circle"))
        {
            System.out.printf("Enter radius of %s: ", figure);
            double r = input.nextDouble();
            System.out.printf("The area of %s is %.2f", figure, circle(r));
        }
    }
    public static double triangle(double a, double h)
    {
        double area = (a * h) / 2;
        return area;
    }
    public static double rectangle(double a, double b)
    {
        double area = a * b;
        return area;
    }
    public static double circle(double radius)
    {
        double area = radius * radius * Math.PI;
        return area;
    }
}
