public class Car {
    
    String car;
    String model;
    int year;
    String color;

    Car(String car, String model, int year, String color) {
        this.car = car;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.car + " " + this.model + " Year: " + this.year + " Color: " + this.color;
    }
}
