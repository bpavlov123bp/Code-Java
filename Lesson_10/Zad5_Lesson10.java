import java.util.Scanner;
public class Zad5_Lesson10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        int beginning = 0;
        int endString = word.length() - 1;
        while(beginning < endString)
        {
            if(word.charAt(beginning) != word.charAt(endString))
            {
                System.out.printf("The string \"%s\" is not palindrome!", word);
                break;
            }
            beginning++;
            endString--;
            if(word.charAt(beginning) == word.charAt(endString))
            {
                System.out.printf("The string \"%s\" is palindrome!", word);
                break;
            }
        }

    }
}
