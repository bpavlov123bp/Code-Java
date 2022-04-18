import java.util.Scanner;
public class Num100200 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(nums100between200(num));
    }
    public static String nums100between200(int num)
    {
        String result = "";
        if(num < 100)
        {
            result = "Less than 100";
        }
        else if(num >= 100 && num <= 200)
        {
            result = "Between 100 and 200";
        }
        else if(num > 200)
        {
            result = "Greater than 200";
        }
        return result;
    }
}
