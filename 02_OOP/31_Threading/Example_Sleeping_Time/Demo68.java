import java.util.Scanner;
public class Demo68 {
    public static void main(String[] args) {
        
        // 69. Threading = Allows a program to run multiple takes simultaneously
        //                 Help improve performance with time-consuming operations
        //                 (File I/O, network communication, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runable interface (better)

        try(Scanner scanner = new Scanner(System.in)) {

            MyRunnable myRunnable = new MyRunnable();
            Thread thread = new Thread(myRunnable);
            thread.setDaemon(true); // uotput wihtout time up when enter a name and end program.
            thread.start();

            System.out.println("You have 5 second to enter your name!.");


            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
        }
    }
}
