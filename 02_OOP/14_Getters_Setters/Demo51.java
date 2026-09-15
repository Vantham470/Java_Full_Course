public class Demo51 {
    public static void main(String[] args) {
        
    /*  52. They help protect object data and add rule for acessing or modifying them.
        - GETTERS = Get (read) the value
        - SETTERS = Set (change) the value

          Think of it like a TV 📺
        Getter → Looking at the TV screen (reading information).
        Setter → Using the remote to change the channel or volume (updating information).
    */
        Motor motor = new Motor("Yamaha","R7", 2026, "Black", 15000);

        motor.setModel("R6");
        motor.setYear(2026);
        motor.setColor("Blue Violet");
        motor.setPrice(-20000);

        System.out.println("Here is your Motor.");
        System.out.println(motor);
    }
}
