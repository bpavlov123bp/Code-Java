import java.util.Scanner;
public class Cinema {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Price of ticket: ");
        double priceTicket = input.nextDouble();
        double priceRetired = 2 * (priceTicket - (priceTicket * 0.10));
        double priceStudent = 1 * (priceTicket - (priceTicket * 0.30));
        double schoolBoy = 2 * (priceTicket - (priceTicket * 0.50));
        double total = priceRetired + (2 * priceTicket) + priceStudent + schoolBoy;
        System.out.printf("Total price is %.2f", total);
    }
}
