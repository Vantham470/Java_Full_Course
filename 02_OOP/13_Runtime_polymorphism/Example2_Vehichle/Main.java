class Vehicle {
    void go() {
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("The car is driving.");
    }
}

class Bicycle extends Vehicle {
    @Override
    void go() {
        System.out.println("The bicycle is pedaling.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bicycle();

        v1.go();
        v2.go();
    }
}
