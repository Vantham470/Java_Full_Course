public class Demo9 {
    public static void main(String[] args) {
        
        // 10. printf() = is a method use to format output
        // %[flags][width][.precision][specialer-character]

        String name = "Levin";
        char firstLetter = 'V';
        int age = 19;
        double height = 160;
        boolean isDeveloper = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a %c", firstLetter); // %c = char
        System.out.printf("You are %d year old\n", age); // d = integer
        System.out.printf("You are %f inches tall\n", height); // f = double
        System.out.printf("Developer: %b\n", isDeveloper); // b = boolean 

        // insert multiple variables within the same line
        System.out.printf("%s is %d year old\n", name, age);

        // Precision
        // [flags] :

        // + = output a plus
        // , = comma grouping separator
        // ( = negative number are enclosed in ()
        // space = display a minus if negative , space if positive 


        /*
         double = price1 = 9.99;
         double price2 = 100.45;
         double price3 = -44.77;

         System.out.printf("%.2f\n", price1)
         System.out.printf("%.2f\n", price2)
         System.out.printf("%.2f\n", price3)
         */


        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 30;
        int id3 = 543;
        int id4 = 3402;

        System.out.printf("%05d\n", id1);     // 00001
        System.out.printf("%5d\n", id2);     // space + 30
        System.out.printf("%-5d\n", id3);    // Negative number = left justified padding
        System.out.printf("%05d\n", id4);

}
}