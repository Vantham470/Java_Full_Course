public class Demo25 {
    public static void main(String[] args) {
        // 26. methods = s block of reusable code that is execute of when called ()

    /* 
        String name = "Levin";
        int age = 20;

        happyBirthday(name, age);
        
        }
        static void happyBirthday(String name, int age){
            System.out.println("Happy Birthday to you!");
            System.out.printf("Happy Birthday dear %s\n" , name);
            System.out.printf("You are %d year old!\n", age);
            System.out.println("Happy Birthday to you!\n");
        }
    */
        // String fullName = getFullName("Levin", "Prime");
        // System.out.println(fullName);

        int age = 20;

        if(ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }
        
    }
    static void happyBirthday(String name, int age) {}
    static double square(double number) {return number * number;}
    double cube(double number){return number * number;}
    static String getFullName(String first, String last) {return first + " "+ last;}
    static boolean ageCheck(int age) {
        if(age >= 18) {
            return true; 
        }
        else {
            return false;
        }
    
    }
    
}
