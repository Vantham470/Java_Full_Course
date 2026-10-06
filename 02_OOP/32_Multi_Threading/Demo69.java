public class Demo69 {
    public static void main(String[] args) {
        
        // 70. Multithreading = Enalbel program to run threads concurrently 
        //                      (Thread = A set of instructions that run independent) 
        //                      useful for background tasks or time-consuming operations


        //MyThreadable myThreadable = new MyThreadable();
        //Thread thread = new Thread(myThreadable);
        //thread.start();

        Thread thread1 = new Thread(new MyThreadable("Lalalalala!"));
        Thread thread2 = new Thread(new MyThreadable("hehe!"));

        System.out.println("Game start!.");

        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        System.out.println("Game over!.");
    }
}
