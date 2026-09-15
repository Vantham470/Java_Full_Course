public class Demo42 {
    public static void main(String[] args) {
        // 43.  static = Make a variable or method belong to the class
        //               rather than as any specific object.
        //               commonly used for uitlity methods or shared resourse..
        
        Friend42 friend1 = new Friend42("John", "123", 25);
        Friend42 friend2 = new Friend42("Jane", "456", 30);
        Friend42 friend3 = new Friend42("Mike", "789", 28);

        
        Friend42.displayNumOfFriends(); // Call the static method to display the number of friends

        // Displaying the details of each friend
        System.out.println("Friend 1: " + friend1.name + ", ID: " + friend1.id + ", Age: " + friend1.age);
        System.out.println("Friend 2: " + friend2.name + ", ID: " + friend2.id + ", Age: " + friend2.age);
        System.out.println("Friend 3: " + friend3.name + ", ID: " + friend3.id + ", Age: " + friend3.age);
    }
}
