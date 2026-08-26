import java.util.Scanner;
public class Demo13 {
    public static void main(String[] args) {
        // 14. substring() = A method use to extract a portion of a string 
        //                   .substring(start, end) 

        try(Scanner scanner = new Scanner(System.in)) {

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {


        // String username = email.substring(0, 8); // extracts the substring from index 0 to index 7 (8 is exclusive)
        // String domain = email.substring(8, 18); // extracts the substring from index 8 to index 17 (18 is exclusive)
        username = email.substring(0, email.indexOf("@")); // extracts the substring from index 0 to the index of "@"
        domain = email.substring(email.indexOf("@") + 1); // extracts the substring from the index of "@" + 1 to the end of the string

        System.out.println(username);
        System.out.println(domain);
        }
        else {
            System.out.println("Emails must contain '@'.");
        }
    }
    }
}
