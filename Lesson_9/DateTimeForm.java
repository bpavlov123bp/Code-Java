import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeForm {
    public static void main(String[] args)
    {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Date Time before format: " + myDateTime);
        DateTimeFormatter myDateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDate = myDateTime.format(myDateTimeFormat);
        System.out.print("Date Time after format: " + formatDate);
    }
}
