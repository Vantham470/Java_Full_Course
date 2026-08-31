import java.util.Scanner;
public class Demo19 {
    public static void main(String[] args) {
        // 20. Logical operator
        //     && = AND : both must be true
        //     || = OR  : at least one condition need to be true
        //     !  = NOT : check something is not true

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain space or underscore

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 - 12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain underscore");

        }
        else{
            System.out.println("Welcome " + username);
        }


        /* double temp = 0;
           boolean isSunny = true;

        
          if(temp <= 30 && temp >= 0 && isSunny) {
              System.out.println("The weather is Bad!");
              System.out.println("It is SUNNY outside!");
          }
          else if(temp <= 30 && temp >= 0 && !isSunny) {
              System.out.println("The weather is Good!");
              System.out.println("It is CLOUDY outside!");
          }
          else if(temp > 30 || temp < 0){
              System.out.println("The weather is bad");
          }
        */
        scanner.close();
    }
}