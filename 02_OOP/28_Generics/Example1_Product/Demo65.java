public class Demo65 {
    public static void main (String[] args) {

        // 66. Generic = Generics in Java is a feature that allows you to write classes, interfaces, and methods that work with different data types while maintaining type safety. 
        //               It was introduced in Java 5 to reduce runtime errors and eliminate unnecessary type casting.
        //               <T, U> type parameter (placeholder that get replcaced with
        //               <String> type arguement (specific the type)

        // Box<String> box = new Box<>();
        // Box<Integer> box = new Box();
        // Box<Boolean> box = new Box();

        // box.setItem("Apple");
        // box.setItem(7);
        // box.setItem(4.00);

        Product <String, Double> product1 = new Product<>("Apple", 0.60);
        Product <String, Double> product2 = new Product<>("Yamaha R6", 20000.0);

        System.out.println(product2.getPrice());
    }
}