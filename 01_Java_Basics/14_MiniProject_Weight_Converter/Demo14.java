import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args) {
    // 15. WEIGHT CONVERSATION PROGRAM

    Scanner scanner = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;

    System.out.println("Welcome to the weight conversion program!");
    System.out.println("1. Convert lbs to kgs");
    System.out.println("2. Convert kgs to lbs");
    
    System.out.print("Choose an option: ");
    choice = scanner.nextInt();

    if(choice == 1) {
        System.out.print("Enter weight in lbs: ");
        weight = scanner.nextDouble();
        newWeight = weight * 0.453592;
        System.out.printf("The new weight in kgs is: %.2f%n", newWeight);
    } 
    else if(choice == 2) {
        System.out.print("Enter weight in kgs: ");
        weight = scanner.nextDouble();
        newWeight = weight / 0.453592;
        System.out.printf("The new weight in lbs is: %.2f%n", newWeight);
    } 
    else {
        System.out.println("Invalid choice. Please choose either 1 or 2.");
    }


    scanner.close();
    } 
}
