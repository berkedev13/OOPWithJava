package Student;
import java.util.Date;
public class GraduateStudent extends Student{
    String advisor;
    String thesis;
    GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis){
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduate student studies on " + major);
        writeThesis();
        meetWithAdvisor();
    }

    @Override
    public void register() {
        System.out.println("Student registered as Graduate");
    }

    @Override
    public String toString() {

        return super.toString() + "\nAdvisor: " + advisor + "\nThesis: " +thesis;
    }

    public void writeThesis() {
        System.out.println("Graduate student is writing his thesis.");
    }
    public void meetWithAdvisor() {
        System.out.println("Graduate student's advisor is " + advisor);
    }
}
