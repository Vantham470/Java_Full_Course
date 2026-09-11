import java.util.Scanner;
public class Demo32 {
    public static void main(String[] args) {

        // 33. Search an array

        try(Scanner scanner = new Scanner(System.in)) {

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        // int target = 1;

        String[] fruits = {"apple", "orange", "banana"};
        String target;
        boolean isFound = false;

        System.out.print("Enter the fruits to search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) { // for int we use if (target == numbers[i])
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not FOUND in the array.");
        }

    }
}
}