import java.util.Scanner;
public class Zad4_Lesson8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one letter: ");
        String letter = input.nextLine();
        if(letter.length() == 1 && ('a' <= letter.charAt(0)) && (letter.charAt(0) <= 'z')
        && 'Z' <= letter.charAt(0) && (letter.charAt(0) <= 'Z'))
        {
            if(letter.charAt(0) == 'a' || letter.charAt(0) == 'e' || letter.charAt(0) == 'i'
                    || letter.charAt(0) == 'o' || letter.charAt(0) == 'u')
            {
                System.out.println(letter + "is vowel.");
            }
            else
            {
                System.out.println(letter + " is consonant.");
            }
        }
        else
        {
            System.out.println("Invalid input!");
        }

    }
}
