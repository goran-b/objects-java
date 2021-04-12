package Course;

import Library.Clan;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student>studenti;
    private int numberOfStudents=0;

    Course(String courseName){
        this.courseName = courseName;
        studenti=new ArrayList<Student>();
    }

    public void addStudent(Student student){
        this.studenti.add(student);
        this.numberOfStudents++;
    }

    public void removeStudent(String studentName){
        for (int i = 0;i<this.studenti.size();i++){
            if (studenti.get(i).getStudentName().equals(studentName)){
                this.studenti.remove(studenti.get(i));
            }
            this.numberOfStudents--;
        }

    }
    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudenti() {
            return studenti;
    }
    public void printSudents(){
        System.out.println("Students on course: ");
        for (int i = 0;i<this.studenti.size();i++) {
            System.out.print(studenti.get(i).getStudentName()+", ");
        }
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", studenti=" + studenti +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
