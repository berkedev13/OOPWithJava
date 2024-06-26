package Student;
import java.util.Date;

public class UndergraduateStudent extends Student{
    String minor;
    UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }
    @Override
    public void study() {
        System.out.println("Student studies on " + major + " and " + minor + ".");
    }
    @Override
    public void register() {
        System.out.println("Undergraduate student registered as Undergraduate");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append("\nMinor: " + minor);
         return s.toString();
    }
}
