public class Friend42 {

    static int numOfFriends = 0; // static variable to keep track of the number of friends
    String name; 
    String id;
    int age;

    Friend42(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        numOfFriends++;
    }
    static void displayNumOfFriends() {
        System.out.println("Number of friends: " + numOfFriends);
    }
}
