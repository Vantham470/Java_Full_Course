import java.util.Random;
import java.util.Scanner;
public class Demo29 {
    public static void main(String[] args) {

        // 30. JAVA # OF DICE FORM THE USER

    // DECALRE VARIABLES 
        try(Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int numofDice;
            int total = 0;

            System.out.print("Enter the number of dice to roll: ");
            numofDice = scanner.nextInt();

    // GET # OF DICE FROM THE USER
    // ROLL ALL THE DICE
    // GET THE TOTAL
            if (numofDice > 0) {
               for (int i = 0; i < numofDice; i++)  {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
               }
               System.out.println("Total: " + total);
            }
            else {
                System.out.println("# of Dice must be greater than 0: ");
            }


        // DISPLAY ASCII OF DICE


    }
    }
    static void printDie(int roll) {
        String dice1 = """
                -------
                |      |
                |   ●  |
                |      |
                -------
                """;

        String dice2 = """
                -------
                | ●    |
                |      |
                |    ● |
                -------
                """;

        String dice3 = """
                -------
                | ●    |
                |   ●  |
                |    ● |
                -------
                """;

        String dice4 = """
                -------
                | ●  ● |
                |      |
                | ●  ● |
                -------
                """;

        String dice5 = """
                -------
                | ●  ● |
                |   ●  |
                | ●  ● |
                -------
                """;

        String dice6 = """
                -------
                | ●  ● |
                | ●  ● |
                | ●  ● |
                -------
                """;

        switch (roll) {
                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);
                default -> System.out.print("Invalid roll");
        }

    


        

    }
}
