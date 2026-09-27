import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Demo58 {
    public static void main (String[] args) {

        // 59. How to read a file in Java (3 ways)

        // 1. Using BufferedReader + FileReader = Best for reading texxt files line-by-line
        // 2. FileInputStream =  Best for binary files (e.g., images, audio files, etc.)
        // 3. RandomAccessFile = Best for reading and writing specific portion of a large file.

        String filePath = "C:\\Users\\vanth\\OneDrive\\Desktop\\test1.txt";
        

        try ( BufferedReader br = new BufferedReader(new FileReader(filePath))){
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        }
    }
}
