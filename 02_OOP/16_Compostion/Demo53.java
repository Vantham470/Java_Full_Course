public class Demo53 {
    public static void main(String[] args) {
        // 54. composition = Represent a "part-of" relationship between object.
        //                   example , a Engine is "part of" a Car.
        //                   Allow complex objects to be constructed from smaller object.

        Car car = new Car("Lamborghini", 2023, "V12");

        System.out.println("Car model: " + car.model);
        System.out.println("Car year: " + car.year);
        System.out.println("Engine type: " + car.engine.type);

        car.start();

    }
}