public class Demo40 {
    public static void main(String[] args) {
        
        // 41. Overload constructers = Allow a class to multiple constructors 
        //                         with different parameters list.
        //                         Enable object to be initialized in varoius ways.

        User user1 = new User("Levinho", "levinho7@example.com", 25);
        User user2 = new User("Vanntham", "vanntham@example.com", 20);

        System.out.println("User 1: " + user1.username + ", Email: " + user1.email + ", Age: " + user1.age);
        System.out.println("User 2: " + user2.username + ", Email: " + user2.email + ", Age: " + user2.age);
    }
}