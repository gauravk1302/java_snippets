import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();


        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
    }
}
