import java.util.Arrays;
public class Demo30 {
    public static void main(String[] args) {
        // 31. array = a collection of values the same data type
        //         * think of it as a variable that can store more than 1 value * 

        String[] fruits = {"apple", "orange", "coconut", "banana"};

        /* 
         // fruits [0] = "pineapple";
         int numOfFruits = fruits.length;
         Arrays.sort(fruits);  // to order it
         Arrays.fill(fruits, "pineapple"); // 4 element become pineapple
        */
        Arrays.sort(fruits);

        /* print all element use for loop
         for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
         }
        */


        // use enhanced for loop 
        for (String fruit : fruits) {
            System.out.println(fruit);
}
    }
}
