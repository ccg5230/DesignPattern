package design.pattern.MVC;

/**
 * @className StudentView
 * @Description
 * @Author chungaochen
 * Date 2019/7/30 16:59
 * Version 1.0
 **/
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}