public class Car38 {
    String make = "Lamborghini";
    String model = "Aventador";
    int year = 2026;
    double price = 1000000.00;

    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You have started the car");
    }
    void stop() {
        isRunning = false;
        System.out.println("You have stopped the car");
    }
    void drive() {
        System.out.println("You are driving a " + make + " " + model + " from " + year);
    }
    void brake() {
        System.out.println("You are braking a " + make + " " + model + " from " + year);
    }

    
}
