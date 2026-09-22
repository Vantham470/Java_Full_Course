public class Motor {

    private final String name; // readable 
    private String model;
    private int year;
    private String color;
    private int price;

    Motor(String name, String model, int year, String color, int price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    String getName() {
        return this.name;
    }
    String getModel(){
        return this.model;
    }
    int getYear(){
        return this.year;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price; // use string because of this "$"
    }


    // use this to easy to change year, color, price 
    void setModel(String model) {
        this.model = model; //  recieve new model
    }
    void setYear(int year) {
        this.year = year; // new year receive 
    }
    void setColor(String color) {
        this.color = color; //  new color receive
    }
    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot less than ZERO!");
        }
        else{
            this.price = price; // new price recieve 
        }
    }
    
    // Constructor
    @Override
    public String toString() {
        return "Name: " + name +
        "\nModel: " + model + 
        "\nYear: " + year + 
        "\nColor: " + color + 
        "\nPrice: " + price;
    }

}