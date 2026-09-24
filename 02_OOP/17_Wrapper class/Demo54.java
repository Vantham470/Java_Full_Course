public class Demo54 {
    public static void main(String[] args) {

        // 55.Wrapper classes = Allow primitive values(int, char, double, boolean)
        //                      to be accessed as objects.
        //                       Generally, don't wrap primitives useless you need an object.
        //                       Allow use of colloections Frameworks, and static Ultility Methods.
/* 
    // Autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
        Integer a = 7;
        Double b = 3.14;
        Character c = 'A';
        Boolean d = true;
    // Unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.
        int x = a;
        double y = b;
*/
/* 
        String a = Integer.toString(7);
        String b = Double.toString(3.14);
        String c = Character.toString('A');
        String d = Boolean.toString(true);

        String x = a + b +c + d;
        System.out.println(x);
*/
        char letter = 'a';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
