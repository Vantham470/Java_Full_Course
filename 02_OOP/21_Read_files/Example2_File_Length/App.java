import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {


        String filePath = "C:\\Users\\vanth\\OneDrive\\Desktop\\test1.txt";

        File file = new File(filePath);

        System.out.println("Exists: " + file.exists());
        System.out.println("Length: " + file.length());

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
