import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args){
        // 19. Calculator program

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: " );
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: " );
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 -num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.print("Cannot divide by zero! ");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.print("Invalid operator! ");
                validOperation = false;
            }
        }
        if(validOperation){
            System.out.print(result);
        }

        scanner.close();

    }
}
