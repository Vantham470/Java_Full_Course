public class Demo26 {
    public static void main(String[] args) {
        // 27. Overload methods = methods that share the same name,
        //                    but the different parameters
        //                    signature = name + parameters

        String pizza = bakPizza("Flat break", "morzzarella", "pepperoni");
        System.out.println(pizza);
    }
    static String bakPizza(String bread){
        return bread + " pizza";
    }
    static String bakPizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakPizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}