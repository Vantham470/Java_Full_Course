import java.util.Scanner;

public class Demo22 {
    public static void main(String[] args) throws InterruptedException {
         // 23. for loop = execute some code a CERTAIN amount of time 


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("How many seconds to countdown from?: ");
            int start = scanner.nextInt();

            for (int i = start; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }

            System.out.println("HAPPY NEW YEAR!");
        }
    }
}


/* 
        for(int i = 0; i < 10; i++){
        for(int = 1; i <= 10; i++)          // count from 1 to 10
        for(int i 10; i > 0; i--)
        for(int i = 1; i <= 10; i+=2)       // increment by 2
        for(int i = 10; i > 0; i-=)           // decrement by 2
            System.out.println("Pizza"); // output pizza x 10
    }



try(Scanner scanner = new Scanner(System.in)) {

    System.out.print("Enter how many time do you want to loop: ");
    int max = scanner.nextInt();

    for(int i = 0; i <= max; i++) {
        System.out.println(i);
    }
        

}
*/
