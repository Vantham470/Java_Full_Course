enum Gender {
    MALE,
    FEMALE
}
public class Sex {
    public static void main(String[] args) {
        
        Gender gender = Gender.MALE;

        switch (gender) {
            case MALE:
                System.out.println("Gender is Maek");
                break;
            
            case FEMALE:
                System.out.println("Gender is Female");
                break;
        }
    }
}
