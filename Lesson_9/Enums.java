import java.util.Scanner;
public class Enums {
    enum Season
    {
        WINTER,
        SPRING,
        SUMMER,
        FALL
    }
    public static void main(String[] args)
    {
        for(Season s : Season.values())
        {
            System.out.print(s + ", ");
        }
        System.out.println("\nValue of WINTER is: " + Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());
    }
}
