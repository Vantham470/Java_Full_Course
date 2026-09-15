import java.util.Scanner;
import java.util.Random;
public class Demo38 {
    public static void main(String[] args) {
        
        // Object- Oriented programming (OOP) is a programming paradigm that uses objects and classes to structure code. 
        // It allows for encapsulation, inheritance, and polymorphism, making it easier to manage and maintain complex software systems.
        // 39. Object = An entity that hold data (attributes) 
        //          and can perform actions (methods)
        //          It is a refereance data type


        try (Scanner scanner = new Scanner(System.in)) {
       
            Car38 car = new Car38();
            Car38 car1 = new Car38();
            Car38 car2 = new Car38();
           car.isRunning = true;

           System.out.println(car.model); 
           System.out.println(car.make);
           System.out.println(car.year);
           System.out.println("$" +car.price);
           System.out.println("Is the car running? " + car.isRunning);
     
        
       
         System.out.println(car.isRunning);
         car.start();
         System.out.println(car.isRunning);
         car.stop();
         System.out.println(car.isRunning);
      
       
    
       
         car.drive();
         car.brake();
    


         System.out.println(car1.make + " " + car1.model + " " + car1.year);
         System.out.println(car2.make + " " + car2.model + " " + car2.year);
       }

    }
}
