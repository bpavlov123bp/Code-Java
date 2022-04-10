import java.util.Scanner;
public class VowelsSum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int sum = 0;
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == 'a')
            {
                sum += 1;
            }
            else if(sentence.charAt(i) == 'e')
            {
                sum += 2;
            }
            else if(sentence.charAt(i) == 'i')
            {
                sum += 3;
            }
            else if(sentence.charAt(i) == 'o')
            {
                sum += 4;
            }
            else if(sentence.charAt(i) == 'u')
            {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
