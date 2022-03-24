import java.util.Scanner;
public class Zad2_Lesson7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilogram: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();
        double bodyIndex = weight / (height * height);
        System.out.printf("\nThe body mass index is: %.2f\n", bodyIndex);
        if(bodyIndex < 18.5)
        {
            System.out.println("Underweight");
        }
        else if(bodyIndex >= 18.5 && bodyIndex < 25)
        {
            System.out.println("Normal weight");
        }
        else if(bodyIndex >= 25 && bodyIndex < 30)
        {
            System.out.println("Overweight");
        }
    }
}
