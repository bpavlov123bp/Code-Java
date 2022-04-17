import java.util.Scanner;
public class ReturnGradeMethod {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        System.out.printf("%c", getGrade(score));
    }
    public static char getGrade(double score)
    {
        if(score >= 90.0)
        {
            return 'A';
        }
        else if(score >= 80.0)
        {
            return 'B';
        }
        else if(score >= 70.0)
        {
            return 'C';
        }
        else if(score >= 60.0)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
}
