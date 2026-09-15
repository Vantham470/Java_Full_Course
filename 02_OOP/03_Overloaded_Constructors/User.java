public class User {
    
       
        String username;
        String email;
        int age;

       // Contructor 1: Only username
       public User(String username) {
        this.username = username;
        this.email = "Not provided"; // Default
        this.age = 0;                // Default
       }

       // Constructor 2: username and email
       public User(String username, String eamil) {
        this.username = username;
        this.email = email;
        this.age = 0;
       }

       // Constructor 3: username, email, and age
         public User(String username, String email, int age) {
          this.username = username;
          this.email = email;
          this.age = age;
         }
    }

