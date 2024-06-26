package Student;
import java.util.Date;
public abstract class Student {
    int no;
    String name;
    int year;
    Date dob;
    String major;
    Student(int no, String name, int year, Date dob, String major){
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public abstract void study();
    public abstract void register();
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("No: " + no + "\n");
        s.append("Name: " + name + "\n");
        s.append("year: " + year + "\n");
        s.append("Major: " + major);
        return s.toString();
    }

}
