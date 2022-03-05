import java.util.Locale;
import java.util.Scanner;
public class DecimalToHex {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        String str = Integer.toHexString(num).toUpperCase();
        System.out.print(str + " ");
    }
}
