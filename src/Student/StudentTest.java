package Student;

public class StudentTest {
    public static void main(String[] args) {
        RegistrationOffice rO = new RegistrationOffice();
        Student s = rO.getAStudent();
        s.register();
        System.out.println();
        s.study();
    }
}
