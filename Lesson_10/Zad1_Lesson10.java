import java.util.Scanner;
public class Zad1_Lesson10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while(num < 100)
        {
            System.out.print("Enter one number: ");
            num = input.nextInt();
            if(num < 0)
            {
               continue;
            }
            else if(num >= 100)
            {
                break;
            }
            sum += num;
        }
        System.out.println("The sum is: " + sum);
    }
}
