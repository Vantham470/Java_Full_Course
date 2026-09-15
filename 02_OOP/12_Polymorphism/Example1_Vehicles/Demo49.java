public class Demo49 {
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHARE"
        //                 object can indentify as other objects.
        //                 object can be treated as object of common superclass

        Car car = new Car(); 
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
