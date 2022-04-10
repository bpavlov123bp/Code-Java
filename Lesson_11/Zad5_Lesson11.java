import java.util.Scanner;
public class Zad5_Lesson11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one sentence: ");
        String sentence = input.nextLine();
        int vowels = 0;
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e'|| sentence.charAt(i) == 'i' ||
            sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u')
            {
                vowels++;
            }
        }
        System.out.println("The vowels insentences is " + vowels);
    }
}
