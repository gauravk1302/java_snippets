import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Formating_datetime {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before Formatting: " + myObj);

        DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myObj.format(myFormatObject);
        System.out.println("After Formatting: " + formattedDate);
    }
}
