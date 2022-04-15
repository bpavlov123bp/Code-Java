import java.util.Scanner;
public class Zad5_Lesson5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. A password must have at least 8 characters .");
        System.out.println("2. A password must have minimum one upper letter.");
        System.out.println("3. A password must have minimum one digit.");
        System.out.println("4. A password must have minimum one special symbol.");
        System.out.print("Input a password: ");
        String pass = input.nextLine();
        if(isValidPassword(pass))
        {
            System.out.println("Password isvalid: " + pass);
        }
        else
        {

            do {
               System.out.println("Not a valid pasword! Try again!");
               System.out.print("Enter valid password: ");
               pass = input.nextLine();
            }while(!isValidPassword(pass));
        }
    }
    public static boolean isValidPassword(String password)
    {
        if(password.length() < 8)
        {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for(int i = 0; i < password.length(); i++)
        {
            char ch = password.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                numCount++;
            }

            else if(isLetter(ch))
            {
                charCount++;
            }
            else
            {
                return false;
            }
        }
        return (charCount >=2 && numCount >= 2);
    }
    public static boolean isLetter(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
}
