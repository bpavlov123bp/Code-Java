import java.util.Scanner;
public class Zad4_Lesson14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter range of array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Element " + i + ": ");
            array[i] = input.nextInt();
            for(int j = i + 1; j < n; j++)
            {
                if(array[i] == array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The second largest element is: " + array[n - 2]);
        System.out.println("The second smallest element is: " + array[1]);
    }
}
