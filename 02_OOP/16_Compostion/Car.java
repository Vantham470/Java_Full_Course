public class Car {
    String model;
    int year;
    Engine engine;  // composition: Car "has-a" Engine

    Car(String model, int year, String engineType) {
       this.model = model;
       this.year = year;
       this.engine = new Engine(engineType); 
    }

    public void start() {
        engine.start();
        System.out.println("The " + this.model + " is starting.");
        
    }
}