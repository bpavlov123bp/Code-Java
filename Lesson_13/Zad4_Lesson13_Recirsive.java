import java.util.Scanner;
public class Zad4_Lesson13_Recirsive {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter one number: ");
        int num = input.nextInt();
        multTable(num, 1);
    }
    public static void multTable(int n, int i)
    {
        if(i > 10)
        {
            return;
        }
        System.out.println(n + " * " + i + " = " + n * i);
        multTable(n, i + 1);
    }
}
