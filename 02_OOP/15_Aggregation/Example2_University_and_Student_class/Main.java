public class Main {
    public static void main(String[] args) {
        
        Student student = new Student(
            "Thieng Vanntham",
            "Software Development",
            "B20251259",
            2,
            "07-June-2006",
            20
        );

          University university = new University(
            "Norton University",
            "Phnom Penh",
            2010,
            student
        );

        university.displayInfo();
    }
}