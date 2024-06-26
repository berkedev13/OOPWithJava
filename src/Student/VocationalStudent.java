package Student;

import java.util.Date;

public class VocationalStudent extends Student{

    VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational student studies on " + major + ".");
    }

    @Override
    public void register() {
        System.out.println("Student registered as VS");
    }

}
