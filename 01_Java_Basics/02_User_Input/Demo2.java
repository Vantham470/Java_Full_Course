// 2. User input
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();         // 1
        
        System.out.print("Enter your age:");
        int age = scanner.nextInt();               // 2
        
        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();         // 3
        
        System.out.print("Are you a Developer? (true/false: )");
        boolean isStudent = scanner.nextBoolean(); // 4 
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " Year old! ");
        System.out.println("Your gpa is: " + gpa);
        // System.out.println("Developer: " + isStudent);
        
        if(isStudent) {
            System.out.print("You are a Developer");
        }
        else {
            System.out.print("You are NOT a Developer");
        }
    }
        
    
  }

}
