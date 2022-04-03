import java.util.Scanner;
public class Salad {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Tomato: ");
        double tomato = input.nextDouble();
        System.out.print("Cucumber: ");
        double cucumber = input.nextDouble();
        System.out.print("Pepper: ");
        double pepper = input.nextDouble();
        System.out.print("Onion: ");
        double onion = input.nextDouble();
        System.out.print("Cheese: ");
        double cheese = input.nextDouble();
        double totalTomato = tomato * 7.0;
        double totalCucumber = cucumber * 6.0;
        double totalPepper = pepper * 5.0;
        double totalOnion = onion * 3.0;
        double totalCheese = cheese * 15.0;
        double total = totalTomato + totalCucumber + totalPepper + totalOnion + totalCheese;
        if(total <= 200.0)
        {
            System.out.println("You have enough money for the salad.");
        }
        else
        {
            System.out.println("You don't have enough money for the salad.");
        }
    }
}
