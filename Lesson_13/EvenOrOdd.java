import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(evenOdd(num));
    }
    public static String evenOdd(int number)
    {
        String result = "";
        if(number % 2 == 0)
        {
            result = "even";
        }
        else
        {
            result = "odd";
        }
        return result;
    }
}
