import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Zad3_Lesson14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter elemnst of array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        int key = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Element " + i + ": ");
            array[i] = input.nextInt();
        }
        for(int q = 0; q < array.length; q++)
        {
            for(int j = q + 1; j < array.length; j++)
            {
                if(array[q] == array[j])
                {
                    array = removeElements(array, array[j]);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] removeElements(int[] arr, int key)
    {
        int index = 0;
         for(int i = 0; i < arr.length; i++)
         {
             if(arr[i] != key)
             {
                 arr[index++] = arr[i];
             }
         }
         return Arrays.copyOf(arr, index);
    }
}
