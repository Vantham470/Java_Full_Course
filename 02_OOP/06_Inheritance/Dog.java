// Dog inherits from Animal

public class Dog extends Animal {

    public Dog(String name) {
        super(name, true); // Passes the name to the animal constructor, 🔥every dog is automatically alive (true).
    }

    public void bark() {
        System.out.println(name + "Say: Woof Woof!");
    }
    
}
