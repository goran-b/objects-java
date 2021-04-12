package Course;

public class MainCourse {

    public static void main(String[] args) {

        Course course=new Course("Java programming");
        makeStudents(course);
        System.out.println(course);
        course.printSudents();
        course.removeStudent("John");
        course.printSudents();


    }

    public static void makeStudents(Course course){
        Student student1=new Student(1,"John");
        Student student2=new Student(2,"Mark");
        Student student3=new Student(3,"Mattew");
        Student student4=new Student(4,"Luke");
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
    }
}