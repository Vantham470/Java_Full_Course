import java.util.Scanner;
public class Demo24 {
    public static void main(String[] args)  {
        // 25. nested loop = A loop inside another loop
        //                   used often with matrices or DS&A

        try(Scanner scanner = new Scanner(System.in)) {

            int rows;
            int columns;
            char symbol;

            System.out.print("Enter the # of row: ");
            rows = scanner.nextInt();

            System.out.print("Enter the # of column: ");
            columns = scanner.nextInt();

            System.out.print("Enter the symbol to use: ");
            symbol = scanner.next().charAt(0);

            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < columns; j++) {
                    System.out.print(symbol);

                }

                System.out.println();
            }
        }
    }
}
