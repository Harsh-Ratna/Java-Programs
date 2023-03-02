import java.util.Scanner;
import java.util.ArrayList;
class student_functions {
        ArrayList<Student> student_list = new ArrayList<Student>();

        public void print_student(int i)
        {
        System.out.print("Name: " + student_list.get(i).getName()+" | ");
        System.out.print("PRN: " + student_list.get(i).getPrn()+" | ");
        System.out.print("DOB: "+ student_list.get(i).getDob()+" | ");
        System.out.print("Marks: " +student_list.get(i).getMarks()+" | \n\n");
        }

        public void add_student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students to be added: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
                System.out.println("Enter the details of the student in the following format: PRN, Name, Date of Birth (dd/mm/yyyy), Marks");
                String details = sc.next();

                String[] details_array = details.split(",");
                int prn = Integer.parseInt(details_array[0]);
                String name = details_array[1];
                String dob_string = details_array[2];
                int marks = Integer.parseInt(details_array[3]);
                Student new_student = new Student(prn, name, dob_string, marks);
                student_list.add(new_student);
                }
        }
        public void display() {
        for (int i = 0; i < student_list.size(); i++) {
        print_student(i);
        }
        }
        public void search(){
        System.out.println("Select the search criteria: ");
        System.out.println("1. PRN");
        System.out.println("2. Name");
        System.out.println("3. Position");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
                case 1 -> {
                        System.out.println("Enter the PRN to be searched: ");
                        int prn = sc.nextInt();
                        for (int i = 0; i < student_list.size(); i++) {
                                if (student_list.get(i).getPrn() == prn) {
                                        print_student(i);
                                }
                        }
                }
                case 2 -> {
                        System.out.println("Enter the Name to be searched: ");
                        String name = sc.next();
                        for (int i = 0; i < student_list.size(); i++) {
                                if (student_list.get(i).getName() == name) {
                                        print_student(i);
                                }
                        }
                }
                case 3 -> { //position
                        System.out.println("Enter the Position to be searched: ");
                        int position = sc.nextInt();
                        for (int i = 0; i < student_list.size(); i++) {
                                if (i == position) {
                                        print_student(i);
                                }
                        }
                }
                default -> System.out.println("Invalid choice");
        }
        }
        public void update(){
        System.out.println("Enter the PRN of the student to be updated: ");
        Scanner sc = new Scanner(System.in);
        int prn = sc.nextInt();
        for (int i = 0; i < student_list.size(); i++) {
        if (student_list.get(i).getPrn() == prn) {
        System.out.println("Enter the details of the student in the following format: PRN, Name, Date of Birth (dd/mm/yyyy), Marks");
        String details = sc.next();
        String[] details_array = details.split(",");
        int prn_new = Integer.parseInt(details_array[0]);
        String name_new = details_array[1];
        String dob_string_new = details_array[2];
        int marks_new = Integer.parseInt(details_array[3]);
        Student new_student = new Student(prn_new, name_new, dob_string_new, marks_new);
        student_list.set(i, new_student);
        }
        }
        }

        public void delete(){
        System.out.println("Enter the PRN of the student to be deleted: ");
        Scanner sc = new Scanner(System.in);
        int prn = sc.nextInt();
        for (int i = 0; i < student_list.size(); i++) {
        if (student_list.get(i).getPrn() == prn) {
        System.out.println("Student named:"+ student_list.get(i).getName() + " deleted successfully");
        student_list.remove(i);
        }
        }
        }
        }
