import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner fileScanner = new Scanner(new File("data.txt"))) {

            try {
                String firstLine = fileScanner.nextLine();
                System.out.println("First line: " + firstLine);

            } catch (Exception e) {
                System.out.println("Error reading the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
