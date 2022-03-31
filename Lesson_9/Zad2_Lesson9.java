import java.util.Scanner;
public class Zad2_Lesson9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter result: ");
        int result = input.nextInt();
        if(result <= 25)
        {
            System.out.println("F");
        }
        else if(result > 25 && result <= 45)
        {
            System.out.println("E");
        }
        else if(result > 45 && result <= 50)
        {
            System.out.println("D");
        }
        else if(result > 50 && result <= 60)
        {
            System.out.println("C");
        }
        else if(result > 60 && result <= 80)
        {
            System.out.println("B");
        }
        else if(result > 80)
        {
            System.out.println("A");
        }
    }
}
