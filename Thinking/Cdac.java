package Thinking;

import java.util.ArrayList;
import java.util.Scanner;

public class Cdac {

    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Submit Assignment");
            System.out.println("3. Search Student");
            System.out.println("4. Display Queue");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();

                    students.add(studentId);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (!students.isEmpty()) {
                        int submittedStudent = students.remove(0);

                        System.out.println("Assignment submitted by Student: "
                                + submittedStudent);
                    } else {
                        System.out.println("No students in the queue.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    if (students.contains(searchId)) {
                        System.out.println("Student " + searchId
                                + " is in the queue.");
                    } else {
                        System.out.println("Student " + searchId
                                + " is not in the queue.");
                    }
                    break;

                case 4:
                    if (!students.isEmpty()) {
                        System.out.println("Students in the queue: "
                                + students);
                    } else {
                        System.out.println("No students in the queue.");
                    }
                    break;

                case 5:
                    System.out.println("Number of students in the queue: "
                            + students.size());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}