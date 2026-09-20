import java.util.Scanner;

public class Demo50 {
    public static void main(String[] args) {

        // 51. runtime polymophiism = When the methods that gets execute is decided
        //                            at runtime based on the actual type of the object


        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}