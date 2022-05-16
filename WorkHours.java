import java.util.Scanner;
public class WorkHours {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int requredWorkHours = input.nextInt();
        int daysFinishProject = input.nextInt();
        int productivity = input.nextInt();
        double totalTimeEfficientWork = (daysFinishProject - (daysFinishProject * 0.10)) * 12
                * (productivity / 100.0);
        double total = Math.floor(totalTimeEfficientWork);
        if(total < requredWorkHours)
        {
            System.out.println("No");
            System.out.printf("%.0f", (total - requredWorkHours));
        }
        else
        {
            System.out.println("Yes");
            System.out.printf("%.0f", (total - requredWorkHours));
        }
    }
}
