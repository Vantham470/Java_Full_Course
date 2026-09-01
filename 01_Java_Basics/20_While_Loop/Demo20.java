import java.util.Scanner;
public class Demo20 {
    public static void main(String[] args) {
        // 21. while loop = repeat some code forever
        //                  while some condition remain true

        Scanner scanner = new Scanner(System.in);

         int number = 0;

        System.out.print("Enter the number between 1-10: ");
        number = scanner.nextInt();



        do{
            System.out.println("Enter the number between 1-10");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);
        System.out.println("You picked " + number);

        /*int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " year old"); 
        */
        
        /*String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();

        }
        System.out.print("You quit the game");
        */

        /*String name = "";
        
        while(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        */

        scanner.close();
    }
}
