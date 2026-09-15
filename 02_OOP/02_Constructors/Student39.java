public class Student39 {
    String name;
    int age;
    double gpa;
    boolean isGraduated;

    Student39(String name, int age, double gpa, boolean isGraduated) {
       this.name = name;
       this.age = age;
       this.gpa = gpa;
       this.isGraduated = isGraduated;
    }
    void study() {
        System.out.println("" + this.name + " is studying");
    }
    void code() {
        System.out.println("" + this.name + " is coding");
    }
}
