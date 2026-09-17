// Child of Character class

public class Gojo extends Character{


    Gojo(String name, String domainExpansion) {
        super(name, domainExpansion);
    }

    @Override // Use override methods 
    void speak() {
        System.out.println(name+ " open " + domainExpansion);
    }
}
