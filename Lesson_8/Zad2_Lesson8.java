import java.util.Scanner;
public class Zad2_Lesson8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first floating number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second floating number: ");
        double num2 = input.nextDouble();
        if(Double.compare(num1, num2) == 0)
        {
            System.out.println("num1 = num2");
        }
        else if(Double.compare(num1, num2) < 0)
        {
            System.out.println("num1 < num2");
        }
        else
        {
            System.out.println("num1 > num2");
        }
    }
}
