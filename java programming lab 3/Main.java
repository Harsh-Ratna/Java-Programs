import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        student_functions student_functions_object = new student_functions();
        // menu for add, display, search, update, delete
        while(true){
            System.out.println("Select the operation to modify database: ");
            System.out.println("0. Exit");
            System.out.println("1. Add student details");
            System.out.println("2. Display all");
            System.out.println("3. Search student");
            System.out.println("4. Update Details");
            System.out.println("5. Delete record");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    student_functions_object.add_student();
                    break;
                case 2:
                    student_functions_object.display();
                    break;
                case 3:
                    student_functions_object.search();
                    break;
                case 4:
                    student_functions_object.update();
                    break;
                case 5:
                    student_functions_object.delete();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if(choice==0){
                break;
            }
        }
    }
}