import java.util.Scanner;
public class Figures {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        String figure = "";
        do {
            System.out.print("a = ");
            while(!input.hasNextDouble())
            {
                System.out.println("Error! Bad input!");
                input.next();
            }
            a = input.nextDouble();
        }while(a <= 0);
        do {
            System.out.print("b = ");
            while(!input.hasNextDouble())
            {
                System.out.println("Error! Bad input!");
                input.next();
            }
            b = input.nextDouble();
        }while(b <= 0);
        double perimeter = 0.0;
        double area = 0.0;
        if(a == b)
        {
            figure = "square";
            System.out.printf("The figure is %s!\n", figure);
            perimeter = 4 * a;
            area = a * a;
        }
        else if(a != b)
        {
            figure = "rectangle";
            System.out.printf("The figure is %s!\n", figure);
            perimeter = 2 * (a + b);
            area = a * b;
        }
        System.out.printf("The perimeter of %s is %.2f\n", figure, perimeter);
        System.out.printf("The area of %s is %.2f\n", figure, area);
    }
}
