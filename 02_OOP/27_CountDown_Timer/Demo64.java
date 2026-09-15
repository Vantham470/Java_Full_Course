import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class Demo64 {
    public static void main(String[] args) {
        
        // 65. Java COUNTDOWN TIMER PROGRAM

        int response;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter # of seconds to countdown from:  ");
            response = scanner.nextInt();
        
        }

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Hello Levinho, Sasuke, GOJO!");
                    timer.cancel(); // stop when reaching 0 
                }   
            }
        };
    
        timer.scheduleAtFixedRate(task, 0, 1000); //(task, delay, period)
    }
}
