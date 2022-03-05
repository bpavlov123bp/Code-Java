import java.util.Scanner;
public class NumberSystems {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int binary[] = new int[35];
        int id = 0;
        while(num > 0)
        {
            binary[id++] = num % 2;
            num = num / 2;
        }
        for(int i = id - 1; i >= 0; i--)
        {
            System.out.print(binary[i] + " ");
        }
    }
}
