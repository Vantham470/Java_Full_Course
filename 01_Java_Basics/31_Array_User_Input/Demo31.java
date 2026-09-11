import java.util.Scanner;
public class Demo31 {
    static void main(String[] args) {

        // 32. Enter user input into array

        try(Scanner scanner = new Scanner(System.in)) {

        String[] foods;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }
    }
}
}
