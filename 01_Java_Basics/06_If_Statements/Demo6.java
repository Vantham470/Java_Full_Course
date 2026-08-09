import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args) {
        // 7. If statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isDeveloper;

        System.out.print("Are you a Developer (true/false): ");
        isDeveloper = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        

        // GROUP2
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! 😡");
        }
        else{
            System.out.println("Hello " + name + " ");
        }





        // GROUP2
        if(age >= 65){
            System.out.println("You are a Senior! 😙");
        }

        else if(age >=18) {
            System.out.println("You are an Adult! 🤩");

        }
        else if (age < 0) {
            System.out.println("You haven't been born Yet! 🤣");
        }
        else{
            System.out.println("You are Child! 😆");
        }

        // GROUP3
        if(isDeveloper){
            System.out.println("You are a Developer! 💀");
        }
        else{
           System.out.println("You are not a Developer! ☹") ;
        }
        scanner.close();
    }
} 