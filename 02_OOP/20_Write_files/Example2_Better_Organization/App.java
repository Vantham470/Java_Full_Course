import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class App {
    public static void main (String[] args) {
        
        String filePath = "C:\\Users\\vanth\\OneDrive\\Desktop\\test.txt";
        String textContent = "I like Java programming.\nIt's easy to learn and use.\nI'm really enjoying it!";

      /*   String textContent = """
               I like Java programming.
               It's easy to learn and use.
               I'm really enjoying it!
               """;
        */
        
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(textContent);
            System.out.println("File written successfully.");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Could not write file: " + e.getMessage());
        }
    }
}
