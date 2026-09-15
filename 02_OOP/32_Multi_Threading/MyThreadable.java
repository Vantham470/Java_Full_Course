public class MyThreadable implements Runnable {

    private final String text;

    MyThreadable(String text) {
        this.text = text;
    }

    @Override 
    public void run() {
        for(int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(text);
            }

            catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");
            }
        }
        System.out.println("Time up!.");
    }
}