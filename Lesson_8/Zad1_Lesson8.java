import java.util.Scanner;
public class Zad1_Lesson8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a price of shoes: ");
        double price = input.nextDouble();
        System.out.print("Enter size of shoes: ");
        int size = input.nextInt();
        System.out.print("Enter a color of shoes: ");
        String color = input.next();
        System.out.print("Have the shop buy back or not: ");
        String buyBack = input.next();
        if((price <= 150.0) && (size == 45 || size == 44) && (!color.equalsIgnoreCase("black"))
        && (buyBack.equalsIgnoreCase("yes")))
        {
            System.out.println("I buy this shoes!");
        }
        else
        {
            System.out.println("I don't want this shoes!");
        }
    }

}
