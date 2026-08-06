package mainapp;

import models.Student;
import models.Course;
import services.EnrollmentManager;
import java.util.Scanner;

public class Main {
    
    public static Student searchStudentById(Student[] students, int count, String id){
        for (int i = 0; i < count; i++){
            if (students[i].getId().equalsIgnoreCase(id)){
                return students[i];
            }
        }
        return null;
    }
    
    
    public static void sortStudentsByName(Student[] students, int count){
        for (int i = 0; i < count - 1; i++){
            for (int j = 0; j < count - i - 1; j++){
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Students have been sorted alphabetically by name.");
    }
    
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        Student[] students = new Student[100];
        int studentCount = 0;
        
        boolean running = true;

        while (running) {

            System.out.println("\n**** Student Management System ****");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Sort Students");
            System.out.println("5. Exit");
            System.out.print("\nSelect an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice){
                
                case 1: 
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine(); 
                    
                    students[studentCount] = new Student(id, name);
                    studentCount++;
                    break;
                
                case 2:
                    if (studentCount == 0){
                        System.out.println("No students found.");
                    } else {
                        for (int i = 0; i < studentCount; i++){
                            System.out.println(students[i].toString());
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = searchStudentById(students, studentCount, searchId);

                    if (foundStudent != null){
                        System.out.println("Found: " + foundStudent.toString());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                
                case 4:
                    if (studentCount > 0) {
                        sortStudentsByName(students, studentCount);
                    } else {
                        System.out.println("No students to sort.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
        scanner.close();
    }
}