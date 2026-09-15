public class Demo41 {
    public static void main(String[] args) {

        // 42. Array of objects

        // Car car1 = new Car("Toyota", "Red", 2020);
        // Car car2 = new Car("Honda", "Blue", 2019);
        // Car car3 = new Car("lamborghini", "Black", 2026);

        Car41[] cars = {new Car41("Toyota", "Red", 2020), 
                      new Car41("Honda", "Blue", 2019), 
                      new Car41("lamborghini", "Black", 2026)};

                      for(Car41 car : cars) {
                        car.color = "White";
                      }

      for (Car41 car : cars) {
        car.drive();
      }

}
}
