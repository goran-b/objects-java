package Course;

public class Student {
    private int id;
    private String studentName;

    Student(int id,String studentName){
        this.id = id;
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }
}
