package main;

import java.util.List;
import java.util.Scanner;

import dao.StudentDAO;
import dao.StudDAOImp;
import model.Student;

public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudDAOImp();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    dao.addStudent(new Student(name, email, age));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\nID  NAME  EMAIL  AGE");
                    for (Student s : students) {
                        System.out.println(
                                s.getId() + "  " +
                                s.getName() + "  " +
                                s.getEmail() + "  " +
                                s.getAge()
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    name = sc.nextLine();

                    System.out.print("Enter new email: ");
                    email = sc.nextLine();

                    System.out.print("Enter new age: ");
                    age = sc.nextInt();

                    dao.updateStudent(id, name, email, age);
                    System.out.println("Student updated successfully!");
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    id = sc.nextInt();

                    dao.deleteStudent(id);
                    System.out.println("Student deleted successfully!");
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
