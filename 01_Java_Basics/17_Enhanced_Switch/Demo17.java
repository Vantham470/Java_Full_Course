import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args) {
        // 17. Enhanced switches = A replacement to many else if statements
        //                          (Java14 feature)

        try(Scanner scanner = new Scanner(System.in)) {

        System.out.print("Enter the day of week ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday" ,"Thursday" ,"Friday" ->
            System.out.println("It is a weekday 😩");

            case "Saturday", "Sunday" ->
            System.out.println("It is the weekend 😁");
            default -> System.out.print(day + " is not a day");
        }


    }
}
}
