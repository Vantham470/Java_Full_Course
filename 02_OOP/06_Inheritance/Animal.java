public class Animal extends Organism{
    
    boolean isAlive;
    String name;

    public Animal(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
    }
    void eat() {
        System.out.println("The animal is eating");
    }
}
