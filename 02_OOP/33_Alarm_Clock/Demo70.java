import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalTime;
public class Demo70 {
    public static void main(String[] args) throws InterruptedException{
        
        // Java ALARM CLOCK

        try(Scanner scanner = new Scanner(System.in)) {

            DateTimeFormatter formmatter = 
                    DateTimeFormatter.ofPattern("HH:mm:ss");
            
            LocalTime alarmTime = null;
            String filePath = "D:\\Java Lesson (Organized)\\Fake Love BTS.wav"; 
            
            while(alarmTime == null) {
                try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formmatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }
        AlarmClock alarmClock = 
                new AlarmClock(alarmTime, filePath, scanner);
                
        Thread alarmThread = 
                new Thread(alarmClock);

        alarmThread.start(); 

        alarmThread.join(); // wait for the alarm thread to finish
        scanner.close();    // close it manually once we're really done
        
        
        }    
    }
}
