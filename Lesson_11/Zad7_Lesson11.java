import java.util.Scanner;
public class Zad7_Lesson11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        boolean correct = false;
        int attempts = 0;
        do {
            if(attempts == 3)
            {
                System.out.println("Sorry, your account is locked!");
                break;
            }
            System.out.print("Please enter your pin: ");
            int code = input.nextInt();
            if(code == pin)
            {
                correct = true;
                System.out.println("Welcome back again!");
            }
            else
            {
                System.out.println("Wrong code! Try again!");
                attempts++;

            }
        }while(!correct);
    }
}
