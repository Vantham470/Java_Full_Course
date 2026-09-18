public class Demo46 {
    public static void main(String[] args) {
        
        // 47. toString = Methods from the object class.
        //                Used to return string representation of an Object.
        //                By default, it return a hash code as unique identifier.
        //                It can be overriden to provide meaningful detail.

        Car car = new Car("Lamborghini", "SVJ", 2026, "Black");

        System.out.println(car);
    }
}