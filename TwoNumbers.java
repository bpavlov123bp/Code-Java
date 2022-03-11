import java.util.Scanner;
public class TwoNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);
    }
}
