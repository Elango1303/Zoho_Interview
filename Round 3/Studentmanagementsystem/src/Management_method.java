import java.awt.*;
import java.util.Scanner;
import java.util.List;

public class Management_method {
     static Scanner sc = new Scanner(System.in);
    public Student Add_student(){

        Student student = new Student();

        System.out.println("Enter the student id");
        student.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the Student Name :");
        student.setName(sc.nextLine());
        System.out.println("Enter the student Age :");
        student.setAge(sc.nextInt());
        return student;
    }
    public void Update(List<Student> studentList){
        System.out.println("Enter the student id :");
        int studentid = sc.nextInt();
        for (Student student : studentList){
            if(student.getId() == studentid){
                System.out.println("Enter id :");
                int id = sc.nextInt();
                student.setId(id);
                sc.nextLine();
                System.out.println("Enter name :");
                student.setName(sc.nextLine());
                System.out.println("Enter age :");
                student.setAge(sc.nextInt());
            }
        }
        System.out.println("Update sucessfuly........");
    }
    public void remove(List<Student> studentList){
        System.out.println("Enter the student id :");
        int studentid = sc.nextInt();
        for (Student student : studentList){
            if(student.getId() == studentid){
                studentList.remove(student);
            }

        }
        System.out.println("Update sucessfuly........");

    }
    public void Display(List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
