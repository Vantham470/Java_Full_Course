import java.util.Scanner;
public class Demo35 {
    public static void main(String[] args) {

        // 36. JAVA QUIZ GAME


        // QUESTION array[]

        String[] questions = {"Who is the goat in footballer?",
                             "What chip phone is the strongest one?",
                             "Which one is Vannntham nickname?",
                             "What major did Levinho study?",
                             "Guess his personality."};

        // OPTION array[][]

        String[][] options = {{"1. Messi", "2. Neymar", "3. Ronaldo"},
                              {"1. Helio G99", "2. Apple Bionic", "3. Snap Dragon"},
                              {"1. Prime", "2. Kenzo", "3. Levinho"},
                              {"1. Computer Science", "2. Cyber Security", "3. SOftware Development"},
                              {"1. Anger", "2. Friendly", "3. Independent"}};

        // DECLARE VARIABLE

        int[] answers = {3, 3, 3, 3, 3};
        int score = 0;
        int guess;

        try (Scanner scanner = new Scanner(System.in)) {

        // WELCOME MESSAGE

        System.out.println("*******************************");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("*******************************");

        // QUESTION (loop)

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("*********");
                System.out.println("CORRECT! ");
                System.out.println("*********");
                score++;
            }
            else{
                System.out.println("*********");
                System.out.println("WRONG! ");
                System.out.println("*********");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);
    
    }

    }
}