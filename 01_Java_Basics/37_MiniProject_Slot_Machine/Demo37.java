import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Demo37 {

    public static void main(String[] args) {

        // 38. JAVA SLOT MACHINE

        // Force UTF-8 output
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {

            int balance = 100;
            int bet;
            int payout;
            String[] row;
            String playAgain;

            System.out.println("***********************************");
            System.out.println("   Welcome to Java Slot Machine");
            System.out.println("Symbols: 🍒 🍇 🍓 🥕");
            System.out.println("***********************************");

            while (balance > 0) {

                System.out.println("\nCurrent Balance: $" + balance);
                System.out.print("Enter your bet amount: ");
                bet = scanner.nextInt();

                if (bet > balance) {
                    System.out.println("❌ Insufficient funds!");
                    continue;
                } else if (bet <= 0) {
                    System.out.println("❌ Invalid bet!");
                    continue;
                }

                balance -= bet;

                System.out.println("\nSpinning...");
                row = spinRow();
                printRow(row);

                payout = getPayout(row, bet);

                if (payout > 0) {
                    System.out.println("🎉 Congratulations! You won $" + payout);
                    balance += payout;
                } else {
                    System.out.println("😢 Sorry! You lost this round.");
                }

                // Stop if balance is zero
                if (balance == 0) {
                    System.out.println("\nYou are out of money!");
                    break;
                }

                // Ask to play again
                while (true) {
                    System.out.print("\nPlay again? (Y/N): ");
                    playAgain = scanner.next().trim().toUpperCase();

                    if (playAgain.equals("Y") || playAgain.equals("YES")) {
                        break; // Continue playing
                    } else if (playAgain.equals("N") || playAgain.equals("NO")) {
                        System.out.println("\nThanks for playing!");
                        return; // Exit program
                    } else {
                        System.out.println("Please enter Y or N.");
                    }
                }
            }

            System.out.println("\nGame Over!");

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
    }

    // Generate random symbols
    static String[] spinRow() {

        String[] symbols = { "🍒", "🍇", "🍓", "🥕" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Print slot row
    static void printRow(String[] row) {
        System.out.println("*********************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*********************");
    }

    // Calculate winnings
    static int getPayout(String[] row, int bet) {

        // Three matching symbols
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍇" -> bet * 3;
                case "🍓" -> bet * 4;
                case "🥕" -> bet * 5;
                default -> 0;
            };
        }

        // First two match
        else if (row[0].equals(row[1])) {

            return switch (row[0]) {
                case "🍒" -> bet;
                case "🍇" -> bet * 2;
                case "🍓" -> bet * 3;
                case "🥕" -> bet * 4;
                default -> 0;
            };
        }

        // Last two match
        else if (row[1].equals(row[2])) {

            return switch (row[1]) {
                case "🍒" -> bet;
                case "🍇" -> bet * 2;
                case "🍓" -> bet * 3;
                case "🥕" -> bet * 4;
                default -> 0;
            };
        }

        return 0;
    }
}
  




