import static javax.swing.JOptionPane.*;
import javax.swing.ImageIcon;
public class Demo {
    public static void main(String[] args)
    {
        String path = "E:/Pictures/Animals/";
        String[] names = {"Lion", "Tiger", "Bear"};
        String[] files = {"lion.png", "tiger.png", "bear.png"};
        String animal = (String)showInputDialog(null, "Which animal you want to see?",
                "Animals", QUESTION_MESSAGE, null, names, names[0]);
        int index = 0;
        for(int i = 1; i < names.length; i++)
        {
            if(animal.equalsIgnoreCase(names[i]))
            {
                index = i;
                break;
            }
        }
        ImageIcon img = new ImageIcon(path + files[index]);
        showMessageDialog(null, img, animal, PLAIN_MESSAGE);
    }
}
