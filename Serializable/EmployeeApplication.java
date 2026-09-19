package Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApplication {

    static ArrayList<Employee> employees = new ArrayList<>();

    static void saveEmployees() {
        try {
            FileOutputStream fos = new FileOutputStream("employees.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(employees);

            oos.close();
            fos.close();

            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving employees.");
        }
    }

    static void loadEmployees() {
        try {
            FileInputStream fis = new FileInputStream("employees.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            employees = (ArrayList<Employee>) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Employees loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("No saved employee file found.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while loading employees.");
        }
    }

    static void addEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, salary));

        System.out.println("Employee added successfully.");
    }

    static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        for (Employee employee : employees) {
            employee.display();
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save Employees");
            System.out.println("4. Load Employees");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    saveEmployees();
                    break;

                case 4:
                    loadEmployees();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}