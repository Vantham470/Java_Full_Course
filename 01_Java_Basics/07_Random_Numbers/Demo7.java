import java.util.Random;
public class Demo7 {
    public static void main(String[] args){
        // 8. Random numbers

        Random random = new Random();

        int number1;
        // int number2;
        // int number3;

        double number;
        number = random.nextDouble(); // random o and 1

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads) {
            System.out.print("HEADS");
        }
        else{
            System.out.print("TAILS");
        }

        number1 = random.nextInt(1, 101); // random 1 to 5 no 6
        // number2 = random.nextInt(1, 101);
        // number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number);
        System.out.println(isHeads);
        // System.out.print(number2);
        // System.out.print(number3);

    }
}
