import java.util.Scanner;
import java.time.Month;
public class SpreingSeason {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        switch(month)
        {
            case 1:
            case 2:
                System.out.println("false");
            break;
            case 3:
                if(day >= 20)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
                break;
            case 4:
            case 5:
                System.out.println("true");
                break;
            case 6:
                if(day <= 20)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("false");
                break;
        }
    }
}
