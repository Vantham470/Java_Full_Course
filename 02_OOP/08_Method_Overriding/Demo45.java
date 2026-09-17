public class Demo45 {
    public static void main(String[] args) {
        // 46. Method overriding = When a subclass provides its own 
        //                         implementation of a method that is already defined.
        //                         Alows for code reusability and give specific implementations.

        Gojo gojo = new Gojo("Gojo", "Infinite void!");
        Itachi itachi = new Itachi("Itachi", "Amaterasu");
        Sasuke sasuke = new Sasuke("Sasuke", "Mangkeyo Sharingan");

        gojo.speak();
        itachi.speak();
        sasuke.speak();

    }
}
