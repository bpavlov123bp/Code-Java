import java.util.Scanner;
public class Zad4_Lesson7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one side of triangle: ");
        double firstSide = input.nextDouble();
        System.out.print("Enter second side of triangle: ");
        double secondSide = input.nextDouble();
        System.out.print("Enter third side of triangle: ");
        double thirdSide = input.nextDouble();
        if((firstSide == secondSide) && (secondSide == thirdSide) && (firstSide == thirdSide))
        {
            System.out.println("The triangle is equilateral");
        }
        else if((firstSide == secondSide) || (secondSide == thirdSide) || (firstSide == thirdSide))
        {
            System.out.println("The triangle is isosceles");
        }
        else
        {
            System.out.println("The triangle is multifaceted");
        }
    }
}
