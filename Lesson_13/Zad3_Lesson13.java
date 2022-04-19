import java.util.*;
public class Zad3_Lesson13 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int players = input.nextInt();
        int[] dice = new int[players];
        //int[] total = new int[players];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < players; i++)
        {
           dice[i] = rand.nextInt(6);

        }
        for(int q = 0; q < dice.length; q++)
        {
            if(dice[q] > max)
            {
                max = dice[q];
                if(dice[q] > dice[count])
                {
                    count = q;
                }
            }
            System.out.println(dice[q]);
        }
        System.out.println(max);
        System.out.println(count);
    }
}
