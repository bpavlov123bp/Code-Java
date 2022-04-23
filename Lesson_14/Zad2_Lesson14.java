import java.lang.reflect.Array;
import java.util.*;
public class Zad2_Lesson14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter number of elements of array: ");
       int n = input.nextInt();
       int[] array = new int[n];
       for(int i = 0; i < n; i++)
       {
           System.out.print("Element " + i + ": ");
           array[i] = input.nextInt();
       }
       System.out.print("Enter element to be inserted: ");
       int number = input.nextInt();
       System.out.print("Enter position to be inserted number: ");
       int position = input.nextInt();
       int[] arrayNew = new int[n + 1];
       for(int i = 0; i < n + 1; i++)
       {
           if(i < position - 1)
           {
               arrayNew[i] = array[i];
           }
           else if(i == position - 1)
           {
               arrayNew[i] = number;
           }
           else
           {
               arrayNew[i] = array[i - 1];
           }
       }
       System.out.println("First array: " + Arrays.toString(array));
       System.out.println("New array: " + Arrays.toString(arrayNew));
    }
}
