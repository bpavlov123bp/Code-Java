import java.util.Scanner;
public class Zad2_Lesson10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int number = input.nextInt();
        long factorial = 1;
        while(true)
        {
            if(number <= 1)
            {
                break;
            }
            factorial *= number;
            number--;
        }
        System.out.println("n! = " + factorial);
    }
}
