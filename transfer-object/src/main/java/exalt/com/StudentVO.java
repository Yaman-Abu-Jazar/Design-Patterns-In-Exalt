package exalt.com;

// Transfer Object Pattern - Design Pattern
// Step 1
// Creating a Transfer Object 
// randomly be named it 'StudentVO.java'
// Class StudentVO
public class StudentVO {

    // Member variables of class
    private String name;
    private int rollNo;

    // Creating a constructor of above class
    public StudentVO(String name, int rollNo) {

        // This keyword for assignment 
        // to same memory block created
        // for every name and roll number of student
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getting name of student 
    public String getName() {
        return name;
    }

    // Setting name of Student 
    public void setName(String name) {
        this.name = name;
    }

    // Getting roll number of student 
    public int getRollNo() {
        return rollNo;
    }

    // Setting roll number of student 
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
