// Interface
interface main {
    void sound();   // abstract method
    void eat();
}

// Class implementing the interface
class Dog implements main {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}
