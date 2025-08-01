package exalt.com;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<>();

        StudentVO s1 = new StudentVO("yaman", 1);
        StudentVO s2 = new StudentVO("anwar", 2);
        students.add(s1);
        students.add(s2);
    }

    public void deleteStudent(StudentVO student){
        students.remove(student.getRollNo());
        System.out.println("Student : Roll No " + student.getRollNo() + ", deleted from database");
    }

    public List<StudentVO> getAllStudents(){
        return students;
    }

    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
    }
    
}
