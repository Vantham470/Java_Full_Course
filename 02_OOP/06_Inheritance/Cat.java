// Cat inherit from ANimal 

public class Cat extends Animal{
    
    public Cat(String name) {
        super(name, false); // Passes to the animal constructor, ❄️ Every cat is auto not alive (false).
    }

    public void meow() {
        System.out.println(name + "Say: Meow!");
    }
}
