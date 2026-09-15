public class Demo39 {
    public static void main(String[] args) {

        // constructor = A special method use to initialize objects
        //               You can pass arguements to a contructor 
        //               and set up initial values

        Student39 student1 = new Student39("Nyro", 20, 3.5, false);
        Student39 student2 = new Student39("Levinho", 22, 3.8, true);

        student1.code();
        student2.study();

        System.out.println(student1.name + " is " + student1.age + " years old with a GPA of " + student1.gpa + ". Graduated: " + student1.isGraduated);

        System.out.println(student2.name + " is " + student2.age + " years old with a GPA of " + student2.gpa + ". Graduated: " + student2.isGraduated);
    }
}
