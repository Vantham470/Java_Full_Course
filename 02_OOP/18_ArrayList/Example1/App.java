import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String [] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            ArrayList<String> foods = new ArrayList<>();

            System.out.print("Enter the # of foods you want to add: ");
            int numOfFoods = Integer.parseInt(scanner.nextLine()); // Reads line AND converts to int
            
            for(int i =1; i <= numOfFoods; i++) {
                System.out.print("Enter food #" + i + ": ");
                foods.add(scanner.nextLine());
            }

            System.out.println(foods);
        }
    }
}
