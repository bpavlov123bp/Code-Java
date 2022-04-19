import java.util.Scanner;
public class Zad2_Lesson13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current likes of the photo: ");
        int current = input.nextInt();
        String comment = "";
        boolean iLikeIt = true;
        int myLike = likes(current, "I like this photo", iLikeIt);
        System.out.println("All likes of the photo is: " + myLike);
    }
    public static int likes(int currentLikes, String comment, boolean ifILike)
    {
        System.out.println(comment);
        if(ifILike)
        {
            currentLikes++;
        }
        return currentLikes;
    }
}
