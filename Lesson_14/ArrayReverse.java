import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args)
    {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int length = array.length;
        int[] reversed = new int[length];
        for(int i = 0; i < length; i++)
        {
            reversed[length - i - 1] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
