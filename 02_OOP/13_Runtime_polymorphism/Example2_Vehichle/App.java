// Parent class
class Animal {
    void speak() {
        System.out.println("The animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks.");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class App {
    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.speak();
        animal2.speak();
    }
}