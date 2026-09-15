import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo57 {
    public static void main(String [] args) {

        // 58. How to write file using java (4 popular ways):

        // 1. Using FileWriter = Good for small medium-sizes text files.
        // 2. Using BufferedWriter = Better perfromance for large amount of text.
        // 3. Using PrintWriter = Best for structure data, like report or logs.
        // 4. Using Files.write() = Best for binary files (e.g., images, audio, files).


        try(FileWriter fw = new FileWriter("C:\\Users\\vanth\\OneDrive\\Desktop\\test.txt")) {
//                                        ("File location here\\test.txt"))
            fw.write("I like Java programming.\nIt's easy to learn and use.");
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
