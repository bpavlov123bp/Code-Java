public class Zad4_Lesson13 {
    public static void main(String[] args)
    {
        multTable();
    }
    public static void multTable()
    {
        System.out.println("\t\t\tMultiplication Table");
        System.out.print("\t");
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(" " + i);
        }
        System.out.println("\n------------------------------------------");
        for(int j = 1; j <= 9; j++)
        {
            System.out.print(j + " | ");
            for(int q = 1; q <= 9; q++)
            {
                System.out.printf("%4d", j * q);
            }
            System.out.println();
        }
    }
}
