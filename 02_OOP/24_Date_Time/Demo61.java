import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.*;
public class Demo61 {
    public static void main (String[] args) {

        // 62. How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestmap)

        // LocalTime time = LocalTime.now(); // Output time H:M:S
        // LocalDate date = LocalDate.now(); // Date
        // LocalDateTime dateTime = LocalDateTime.now(); // output apear both date & time
        // Instant  instant = Instant.now(); // current date and time in UTC
      
       /* 
        // Custom format
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);


        // Custom date time object
        LocalDateTime date = LocalDateTime.of(2026, 8, 9, 4, 44, 0);
        System.out.println(date);
        */

        // compare date

        LocalDateTime date1 = LocalDateTime.of(2026, 9, 8, 4, 50, 0);
        LocalDateTime date2 = LocalDateTime.of(2026, 9, 8, 4, 50, 0);

        if(date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }



    }
}
