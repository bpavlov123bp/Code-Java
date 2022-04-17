import java.util.Scanner;
public class ExcellentResult {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        excellentScore(score);
    }
    public static void excellentScore(int score)
    {
        if(score >= 5)
        {
            System.out.println("Excellent!");
        }
    }
}
