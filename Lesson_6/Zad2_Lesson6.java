import java.util.Scanner;
public class Zad2_Lesson6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int number = input.nextInt();
        boolean isEven = number % 2 == 0;
        String output = isEven ? "The number is even!" : "The number is odd!";
        System.out.println(output);
    }
}
