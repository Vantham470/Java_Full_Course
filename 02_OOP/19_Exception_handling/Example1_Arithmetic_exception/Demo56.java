import java.util.Scanner;

public class Demo56 {
    public static void main(String [] args) {
        
        // 57. Exception Handling = a mechanism to handle runtime errors, so normal flow of the application can be maintained.
        //                          (Divinding by zero, file not found, mismatch input type, etc.)
        //                          surround any dangerous code with a try {} block
        //                          try{}, catch{}, finally{}.

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter another number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
      
    }
}


// with try nest 

/* 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            try {
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter another number: ");
                int num2 = scanner.nextInt();

                int result = num1 / num2;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

*/