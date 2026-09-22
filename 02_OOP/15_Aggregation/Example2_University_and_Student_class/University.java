public class University {
    
    String name;
    String location;
    int foundedYear;

    Student student; // Aggregation 

    University(String name, String location, int foundedYear, Student student) {
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
        this.student = student;
    }

    void displayInfo() {
        System.out.println("University: " + name);
        System.out.println("Location: " + location);
        System.out.println("Founded: " + foundedYear);

        student.displayInfo();
        student.study();
    }
}
