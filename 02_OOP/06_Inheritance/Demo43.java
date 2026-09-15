public class Demo43 {
    public static void main(String[] args) {
    // 44. Inheritance = One class inherit the attributes and methods
    //                   from another class.
    //                   child <- Parent

    Dog dog = new Dog("Buddy");
    Cat cat = new Cat("Whiskers");
    Plants plants = new Plants();

    // Both inherited the eat() method from Animal! class
    dog.eat();
    cat.eat();
    plants.photosynthesize();

    // They can still run their own unique child methods
    dog.bark();
    cat.meow();

    // Checking inherited statuses
    System.out.println(dog.name + " is alive: " + dog.isAlive);
    System.out.println(cat.name + " is alive: " + cat.isAlive);
    

    }
}