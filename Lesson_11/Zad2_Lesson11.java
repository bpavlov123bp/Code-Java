import java.util.Scanner;
public class Zad2_Lesson11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String a = "";
        int sum = 0;
        do {
            for(int i = 1; i <= 2; i++)
            {
                System.out.print("Enter numbers: ");
                int numbers = input.nextInt();
                sum += numbers;
            }
            System.out.printf("The sum is %d: \n", sum);
            sum = 0;
            System.out.print("Continue(Y/N):");
            a = input.next();
        }while(a.charAt(0) == 'Y' || a.charAt(0) == 'y');
    }
}
