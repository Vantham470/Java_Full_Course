import java.util.ArrayList;
import java.util.Scanner;

public class Demo60 {
    public static void main (String[] args) {

        String word = "Sasuke";
        String wordLower = word.toLowerCase(); // Handle uppercase 'S' easily

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Character> wordState = new ArrayList<>();
            int wrongGuesses = 0;

            for (int i = 0; i < word.length(); i++) {
                wordState.add('_');
            }

            System.out.println("*****************************");
            System.out.println("Welcome to Java HangMan game!");
            System.out.println("*****************************");

            while (wrongGuesses < 6) {
                // 1. Print current hangman stage every turn
                System.out.print(getHangmanArt(wrongGuesses));
                
                System.out.print("Word: ");
                for (char c : wordState) {
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.print("Guess a letter: ");
                char guess = scanner.next().toLowerCase().charAt(0);

                // Check against lowercase word
                if (wordLower.indexOf(guess) >= 0) {
                    System.out.println("Correct guess!\n");

                    for (int i = 0; i < word.length(); i++) {
                        if (wordLower.charAt(i) == guess) {
                            // Preserve original casing from 'word' if desired
                            wordState.set(i, word.charAt(i)); 
                        }
                    }

                    if (!wordState.contains('_')) {
                        System.out.print(getHangmanArt(wrongGuesses));
                        System.out.println("YOU WIN!");
                        System.out.println("The word was: " + word);
                        break;
                    }
                } else {
                    wrongGuesses++;
                    System.out.println("Wrong guess!\n");
                }
            }

            // 2. Display final stage on Game Over
            if (wrongGuesses >= 6) {
                System.out.print(getHangmanArt(wrongGuesses));
                System.out.println("GAME OVER!");
                System.out.println("The word was: " + word);
            }
        }
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch(wrongGuesses) {
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                         o      
                                
                      
                      """;
            case 2 -> """
                         o      
                         |      
                      
                      """;
            case 3 -> """
                         o      
                        /|      
                      
                      """;
            case 4 -> """
                         o      
                        /|\\     
                      
                      """;
            case 5 -> """
                         o      
                        /|\\     
                        /       
                      """;
            case 6 -> """
                         o      
                        /|\\     
                        / \\     
                      """;
            default -> "";
        };
    }
}