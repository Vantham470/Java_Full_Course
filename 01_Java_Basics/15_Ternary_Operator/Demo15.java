public class Demo15 {
    public static void main(String[] args) {
        // 16. ternary operator = Return 1 and 2 values if a condition is true
        //    Variable = (condition) ? ifTrue : ifFalse

        int score = 49;
        int number = 3;
        int hours = 13;
        int income = 3000;
        double textRate = (income >= 1500) ? 0.35 : 0.20;

        String result = (score >= 50) ? "You passed the exam!" : "You failed the exam!";
        System.out.println(result);

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);
        System.out.println("Your tax rate is: " + textRate);

    }
}