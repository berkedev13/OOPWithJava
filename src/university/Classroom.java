package university;

public class Classroom {
    String classroomName;
    Course course;
    Student[] students;
    Department department;
    Professor professor;

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}
