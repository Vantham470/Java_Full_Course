public class Demo1 {
       public static void main(String[] args) {
        // 1. Introduction to JAVA
        // System.out.println("Hello VANNTHAM");
        
        // 2. VAriable = a reusable container for a value
        //               a variable behaves as if it was the value it contain
        
        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)
        
        // + primitive vs reference
        // .......      .........
        // int          string
        // double       array
        // char         object
        // boolean      
        
        // 2 step to creating a variable
        // 1. declaration
        // 2. assignment
        
        // primitive
        // int age = 19;
        int year = 2026;
        // double gpa = 9.6; // temperature, currency, price
        double price = 100;
        // char grade = 'A'; // symbol, currency
        char currency = '$';
        // boolean isStudent = true;
        boolean forSale = false;
        
        // use if statement 
        // if(isStudent) {
            // System.out.println("Your are a student!");
        // }
        // else {
            // System.out.println("You are not a student!");
        // }
        
        // + reference
        // String firstName = "RENJI";
        // String lastName = "LEVINHO";
        // String birth_date = "7 June 2006";
        String car = "Lamborghini";
        String color = "Black";
        // String email = "vanthamtyrano@gmail.com";
    
         // System.out.println("Your Email is: " + email);
         System.out.println("Your choice is " + car + " " + color + " " + year);
         System.out.println("The price is: " + currency + price + "M");
         
         if(forSale) {
             System.out.println("There is a " + car + " for sale");
         }
         else {
             System.out.print("The " + car + " is not for sale");
         }
        

    }
}

