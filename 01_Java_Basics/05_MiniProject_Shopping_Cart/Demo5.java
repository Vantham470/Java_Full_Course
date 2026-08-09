import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        // SHOPPING CARD PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("what is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);

        System.out.println(price);

        scanner.close();
        

    }
}