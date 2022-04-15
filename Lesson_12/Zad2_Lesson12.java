import java.sql.SQLOutput;
import java.util.Scanner;
public class Zad2_Lesson12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String character = getMiddleChars(text);
        System.out.println(character);
    }
    public static String getMiddleChars(String str) {
        int index, length;
        if(str.length()%2==0){
            index = str.length() / 2;
            length = 1;
        }
        else{
            index = str.length() / 2 - 1;
            length = 2;
        }
        return str.substring(index,index+length);
    }
}
