import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Management_method ma = new Management_method();
        List<Student> studentList = new ArrayList<>();

        while (true){
            System.out.println("---------------------------------------");
            System.out.println("\t\t Student Managemet System");
            System.out.println("===================================");
            System.out.println("1.Add Student :");
            System.out.println("2.Update Student :");
            System.out.println("3.Remove Student :");
            System.out.println("4.Display Student :");
            System.out.println("5.Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                   Student student= ma.Add_student();
                   studentList.add(student);
                    System.out.println("Student add suceessfuly.....");
                    break;
                case 2:
                    ma.Update(studentList);
                    break;
                case 3:
                    ma.remove(studentList);
                    break;
                case 4:
                    ma.Display(studentList);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invailde input......");

            }
        }
    }
}