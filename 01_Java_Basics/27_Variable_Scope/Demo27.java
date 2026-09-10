public class Demo27 {
    static int x = 3; // Class-level variable
                public static void main(String[] args) {

        // 28. variable scope = where a variable can be accessed 

          int x = 1; // Local variable in main
        
        System.out.println(x);          // Prints 1 (local)
        System.out.println(Demo27.x);   // Prints 3 (class-level!)
        
        doSomething();
    }

    static void doSomething(){
        int x = 2; // Local variable in doSomething
        
        System.out.println(x);          // Prints 2 (local)
        System.out.println(Demo27.x);   // Prints 3 (class-level!)
    }
}

    /*int x = 1;
        System.out.println(x);
        doSomething();

        }
        static void doSomething(){
                int x = 2;
                System.out.println(x);
            
        // output is 1 and 2 no 3
    */

    
   

    
    
