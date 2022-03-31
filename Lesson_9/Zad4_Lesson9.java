import java.util.Locale;
import java.util.Scanner;
public class Zad4_Lesson9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Good: ");
        String goods = input.nextLine().toLowerCase();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        double price = 0.0;
        double sum = 0.0;
        switch(goods)
        {
            case "clothes":
                price = 12.0;
                sum = price * quantity;
                sum -= sum * 0.20;
                break;
            case "shoes":
                price = 25.0;
                sum = price * quantity;
                sum -= sum * 0.10;
                break;
            default:
                price = 14.0;
                sum = price * quantity;
                sum -= sum * 0.05;
                break;
        }
        System.out.printf("The sum is %.2f lv.", sum);
    }
}
