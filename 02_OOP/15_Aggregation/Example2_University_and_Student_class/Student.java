public class Student {
    
    String name;
    String major;
    int year;
    String id;
    String birthdate;
    int age;

    Student(String name, String major, String id, int year, String birthdate, int age) {
        this.name = name;
        this.major = major;
        this.year = year;
        this.birthdate = birthdate;
        this.age = age;
    }

    void study() {
        System.out.println(name + " is coding!");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
        System.out.println("ID: " + id);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Age: " + age);
    }

    // Constructor
    @Override
     public String toString() {
         return "Name: " + name +
                "\nMajor: " + major +
                "\nYear: " + year +
                "\nID: " + id +
                "\nBirthdate: " + birthdate +
                "\nAge: " + age;
}
}
