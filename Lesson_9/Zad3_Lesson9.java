import java.util.Scanner;
public class Zad3_Lesson9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years work: ");
        int yearsWork = input.nextInt();
        double bonus = 0.0;
        if(yearsWork >5 && yearsWork <= 10)
        {
            bonus = salary * 0.05;
        }
        else if(yearsWork > 10 && yearsWork <= 15)
        {
            bonus = salary * 0.07;
        }
        else if(yearsWork > 15)
        {
            bonus = salary * 0.10;
        }
        System.out.println("The bonus is: " + salary);
    }
}
