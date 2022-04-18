import java.util.Scanner;
public class SpeedInfo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double speed = input.nextDouble();
        System.out.println(speedInfo(speed));
    }
    public static String speedInfo(double speed)
    {
        String speedInf = "";
        if(speed <= 10.0)
        {
            speedInf = "slow";
        }
        else if(speed > 10.0 && speed <= 50.0)
        {
            speedInf = "average";
        }
        else if(speed > 50.0 && speed <= 150.0)
        {
            speedInf = "fast";
        }
        else if(speed > 150.0 && speed <= 1000.0)
        {
            speedInf = "ultra fast";
        }
        else if(speed > 1000.0)
        {
            speedInf = "extremely fast";
        }
        return speedInf;
    }
}
