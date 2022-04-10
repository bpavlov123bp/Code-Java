import java.util.Locale;
import java.util.Scanner;
public class Zad4_Lesson11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String command = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true)
        {
            System.out.print("Enter numbers: ");
            command = input.nextLine();
            if(command.equalsIgnoreCase("q"))
            {
                break;
            }
            if(Integer.parseInt(command) > max)
            {
                max = Integer.parseInt(command);
            }
            else if(Integer.parseInt(command) < min)
            {
                min = Integer.parseInt(command);
            }
        }
        System.out.println("The max value of numbers is: " + max);
        System.out.println("The min value of numbers is: " + min);
    }
}
