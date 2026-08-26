public class Demo12 {
    public static void main(String[] args) {
        // 13. String methods

        String name = "Prime Levin";

        // int length = name.length(); // counts the number of characters in the string
        // char letter = name.charAt(0); // gets the character at index 0 (the first character)
        // int index = name.indexOf("i"); // finds the index of the first occurrence of "i"
        // int lastIndex = name.lastIndexOf("i"); // finds the index of the last occurrence of "i"

        // name = name.toUpperCase(); // converts the string to uppercase
        // name = name.toLowerCase(); // converts the string to lowercase
        // name = name.trim(); // removes leading and trailing whitespace from the string
        // name = name.replace("L", "S"); // replaces all occurrences of "L" with "S"
        

        // System.out.println(name); // prints the modified string
        // System.out.println("The length of the string is: " + length);
        // System.out.println("The first character of the string is: " + letter);
        // System.out.println("The index of the first occurrence of 'i' is: " + index);
        // System.out.println("The index of the last occurrence of 'i' is: " + lastIndex);

        /* if(name.isEmpty()) {
             System.out.println("The string is empty.");
         }  else {
              System.out.println("Hello, " + name + "!");
         }      
        */
        
        /* 
            if(name.contains(" ")) {
              System.out.println("Your name is contain space.");
            }
            else{
              System.out.println("Your name is not contain space.");
            } 
        */

        if(name.equalsIgnoreCase("password")) { // compares the string to "password" ignoring case sensitivity
            System.out.println("Your name can't be 'password'");
        }
        else {
            System.out.println("Hello, " + name + "!");
        }


}
}
