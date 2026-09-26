public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            try {
                System.out.println(numbers[5]); // Invalid index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of range.");
            }

            System.out.println("Program continues...");

        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            System.out.println("Done.");
        }
    }
}
