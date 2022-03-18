import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();
        System.out.print("\nEnter your height: ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.printf("\nThe Body Mass Index(BMI) is: %.2f kg/m2.", BMI);
    }
}
