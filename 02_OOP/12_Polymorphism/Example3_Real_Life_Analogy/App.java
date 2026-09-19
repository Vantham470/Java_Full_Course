// 48. Mutlti interface 

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class main implements Flyable, Swimmable {

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class App{
    public static void main(String[] args) {
        main d = new main();
        d.fly();
        d.swim();
    }
}
