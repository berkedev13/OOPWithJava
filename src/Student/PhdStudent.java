package Student;

import java.util.Date;

public class PhdStudent extends GraduateStudent{

    boolean qualifyingExamTaken;
    PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("Phd student studies on " + major );
        writeThesis();
        meetWithAdvisor();
        writePaper();
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
    public void writePaper() {
        System.out.println("Phd Student writes paper.");
    }
}
