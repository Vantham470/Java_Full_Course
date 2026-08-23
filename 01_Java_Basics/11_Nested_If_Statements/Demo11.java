public class Demo11 {
    public static void main(String[] args) {
        // 12.  Nested if statements

        boolean isStudent = true;
        boolean isBackendDeveloper = true;
        double price = 10.99;

        if(isStudent){
            if(isBackendDeveloper){
                System.out.println("You get a Backend Developer discount of 20%!");
                System.out.println("You get a student discount of 10%!");
                price *= 0.7; // 20% discount for backend developers who are also students

            }
            else{
                System.out.println("You get a student discount of 10%!");
                price *= 0.9; // 10% discount for students who are not backend developers
            }
           
        }
        else{
            if(isBackendDeveloper){
                System.out.println("You get a Backend Developer discount of 20%!");
                price *= 0.8; // 20% discount for backend developers who are not students

            }
            else{
                price *= 1; // No discount for non-backend developers who are not students

            }
        }
            

        System.out.printf("The price of a ticket is: $%.2f", price);


        }
    }

