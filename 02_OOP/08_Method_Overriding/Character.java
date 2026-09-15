// parent class 
public class Character {
    
    String name;
    String domainExpansion;

    Character(String name, String domainExpansion) {
    this.name = name;
    this.domainExpansion = domainExpansion;
    }
    void speak() {
        System.out.println(name + " is using: " + domainExpansion);
    }
}
