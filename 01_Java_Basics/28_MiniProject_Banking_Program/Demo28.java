import java.util.Scanner;
public class Demo28 {
    public static void main(String[] args) {
        
        // 29.JAVA BANKING PROGRAM FOR BEGINNERS
        
        try ( Scanner scanner = new Scanner(System.in)) {

    // DELCARE VARIABLE

        double balance = 0;
        boolean isRunning = true;
        int choice;

    // DISPLAY MENU
        while (isRunning) {

            System.out.println("****************");
        System.out.println("BANKING PROGRAM!");
        System.out.println("****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************");
    

    // GET AND PROCESS USER CHOICE
       System.out.print("Enter your Choice (1-4): ");
       choice = scanner.nextInt();

       switch(choice) {
        case 1 -> showBalance(balance);
        case 2 -> balance = balance + deposit(scanner);
        case 3 -> balance -= withdraw(balance, scanner);
        case 4 -> isRunning = false;
        default -> System.out.println("INVALID CHOICE");
       }


    }
    // ✅ EXIT MESSAGE (outside loop)
        System.out.println("********************************");
        System.out.println("Thank you! have a nice day! 😍");
        System.out.println("********************************");

}
       

    // showBalance()
    }
    static void showBalance(double balance) {
        System.out.println("****************");
        System.out.printf("$%.2f\n", balance);
    }
    
    // deposite
    static double deposit(Scanner scanner) {

        double amount;

        System.out.print("Enter an amount to be desposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
        }

        return amount;

    }

    // withdraw
    static double withdraw(double balance, Scanner scanner) {
        double amount; 

        System.out.print("Enter the amount withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if  (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else {
            return amount;
        }

    }
}
