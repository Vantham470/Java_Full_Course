import java.util.TimerTask;
import java.util.Timer;
public class Demo63 {
    public static void main(String[] arsg){

        // Timer = class that schedules tasks at specific time or periodically 
        //         Useful for: sending notification, schedule updates, repetive actions

        // TimerTask = is a class used to define a task that you want a Timer to run later or repeatedly.

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3; // count for 3 time 

            @Override
            public void run(){
                System.out.println("Helloo!");
                count--;
                if(count <= 0) {
                    System.out.println("TASK COMPLETE!");
                    timer.cancel();
                }
            }
        };

        // timer.schedule(task, 3000); wait for 3 second for run task.
        timer.schedule(task, 0, 1000);
    }
}
