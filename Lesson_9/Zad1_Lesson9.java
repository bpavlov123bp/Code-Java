import java.util.Scanner;
public class Zad1_Lesson9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        if(width == height)
        {
            System.out.println("The figure is square.");
        }
        else
        {
            System.out.println("The figure is rectangle.");
        }
    }
}
