import java.util.Scanner;
public class Zad3_Lesson7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int number = input.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
