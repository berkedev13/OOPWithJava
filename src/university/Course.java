package university;

import java.util.Date;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Course {
	String code;
    String name;
    Department department;
    Professor teacher;
    Student[] students;
    String[] days;
    Date time;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public Department getDepartment() {
        return department;
    }
}
