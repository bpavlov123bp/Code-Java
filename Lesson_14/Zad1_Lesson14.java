import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Zad1_Lesson14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];
        int [] arrNew = new int[arr.length - 1];
        System.out.print("Enter searched value: ");
        int valueCheck = input.nextInt();
        for(int i =0; i < arrLength; i++)
        {
            System.out.print("Element " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        for(int q = 0, k = 0; q < arr.length; q++)
        {
            if(arr[q] != valueCheck)
            {
                arrNew[k] = arr[q];
                k++;
            }
        }
        System.out.println("New array: " + Arrays.toString(arrNew));
    }
}
