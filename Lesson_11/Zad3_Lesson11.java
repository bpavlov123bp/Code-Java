import java.util.*;
public class Zad3_Lesson11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String command = "";
        int positive = 0;
        int negative = 0;
        int zero = 0;
        while(true)
        {
            System.out.print("Enter number: ");
            command = input.nextLine();
            if(command.equalsIgnoreCase("q"))
            {
                break;
            }
            if(Integer.parseInt(command) > 0)
            {
               positive++;
            }
            else if(Integer.parseInt(command) < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
        }
        System.out.println("Positive numbers is: " + positive);
        System.out.println("Negative numbers is: " + negative);
        System.out.println("The zero numbers is: " + zero);
    }
}
