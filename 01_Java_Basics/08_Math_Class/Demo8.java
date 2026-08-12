import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args){
        // 9. Math class
        // System.out.println(Math.PI)
        // System.out.println(Math.E)

        // double result;
        // result = Math.pow(2, 4); // output 16
        // result = Math.abs(-5); // from - to + number
        // result = Math.sqrt(9); // like 3 x 3 = 9
        // result = Math.round(3.14); // output = 3.0
        // result = Math.ceil(3.14); // Round up to 4
        // result = Math.floor(3.99); // round down to 3.0
        // result = Math.max(10, 20);
        // result = Math.min(10, 20);

        // System.out.print(result);

        // I. HYPOTENUSE c = Math.sqrt(a² + b²)
        /*Scanner scanner = new Scanner(System.in);

         double a; 
         double b;
         double c;

         System.out.print("Enter the length of side A:");
         a = scanner.nextDouble();

         System.out.print("Enter the length of side B:");
         b = scanner.nextDouble();

         c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

         System.out.printf("The hypotenuse of (side C) is: %.2f cm", c);

         scanner.close();  
        */
            // Circumference = 2 * Math.PI * radius;
    // area = Math.PI * Math.pow(radius, 2);
    // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

    Scanner scanner = new Scanner(System.in);

    double radius;
    double circumference;
    double area;
    double volume;

    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();

    circumference = 2 * Math.PI * radius;
    area = Math.PI * Math.pow(radius, 2);
    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


    System.out.printf("The circumference is: %.1fcm\n", circumference);
    System.out.printf("The area is: %.1fcm²\n", area);
    System.out.printf("The volume is: %.1fcm³\n", volume);


    scanner.close();

    }
    
}
