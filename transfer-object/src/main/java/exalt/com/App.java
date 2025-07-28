package exalt.com;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        // Print all students
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        // Update student
        StudentVO student = studentBusinessObject.getAllStudents().get(0);

        // Custom input  
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // Getting the student
        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
