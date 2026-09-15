public class Demo44 {
    public static void main(String[] args) {
        // 45. Super = Refers to the parents class (subclass <- superclass)
        //             Used in constructors and methods overriding 
        //             Calls the parents constrcutors to initialize attributes

        Person person = new Person("Gojo", "Satoro");
        Student student = new Student("Thieng", "Vanntham", 3.90);
        Employee employee = new Employee("Nyro", "Levinho", 2000);

        person.showName();
        employee.showSalary();
        student.showGpa();
    }
}
