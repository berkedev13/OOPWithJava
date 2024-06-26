package Student;

import java.util.Date;

public class MasterStudent extends GraduateStudent{
    MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master student studies on " + major );
        writeThesis();
        meetWithAdvisor();
    }

    @Override
    public void register() {
        System.out.println("Student registered as Master");
    }
    public void writeThesis() {
        System.out.println("Master student is writing his thesis.");
    }
    public void meetWithAdvisor() {
        System.out.println("Master student's advisor is " + advisor);
    }
}



