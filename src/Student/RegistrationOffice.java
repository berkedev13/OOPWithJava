package Student;

import java.util.Date;

public class RegistrationOffice {
    Student getAStudent(){
        Student s = null;
        int i = (int) (4 * Math.random());
        switch (i) {
            case 0:
                s = new UndergraduateStudent(i, "Ayşe", 1994, new Date(1994,10,10), "Engineering", "Computer");break;
            case 1:
                s = new VocationalStudent(i, "Burak", 1993, new Date(1993,1,13), "International Relations");break;
            case 2:
                s = new GraduateStudent(i, "Ece", 1998, new Date(1998,9,2), "Biology", "Mehmet", "Evolution ");break;
            case 3:
                s = new MasterStudent(i, "Görkem", 2001, new Date(2001,6,12), "Engineering", "Yılmaz", "Java");break;
            case 4:
                s = new PhdStudent(i, "Meriç", 2002, new Date(2002,8,10), "Chemistry", "Ecem", "Oil", true);break;
        }
        return s;
    }
}
