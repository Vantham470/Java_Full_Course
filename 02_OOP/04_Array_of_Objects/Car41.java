public class Car41 {
    String model;
    String color;
    int year;

    Car41(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    void drive() {
        System.out.println("You are driving " + model + " of year " + year + " and color " + color);
    }

}
