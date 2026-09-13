public class Demo33 {
    public static void main(String[] args) {

        // 34. varargs = allow a method to accept a varying # of arguements
        //               make methods more flexible, no need for overload methods 
        //               java will pack the arguement into an array 
        //               ...(ellipsis)



        
        System.out.println(average(1, 2, 3, 4));

        
    


    
    /* 
    static int add(int...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    */
    }
    static double average(double... numbers) {
        double sum = 0;

        if (numbers.length == 0) { // if average empty it return 0
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
        
    
}
