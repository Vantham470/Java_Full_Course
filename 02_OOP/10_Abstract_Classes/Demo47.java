public class Demo47 {
    public static void main(String[] args) {
        
        // 47. Abstract = used to defined abstract classes and methods.
        //                Abstraction is the process of hiding implementatioon detail
        //                and show only essential feature;
        //                Abstract classes CAN'T be instantiated directly
        //                Can contain 'abstract' methods (which must be implemented)
        //                Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
