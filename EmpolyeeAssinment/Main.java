package EmpolyeeAssinment;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static EmployeeList employeeList = new EmployeeList();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployeeMenu();
                    break;

                case 2:
                    displayMenu();
                    break;

                case 3:
                    sortMenu();
                    break;

                case 4:
                    System.out.println("Save to File selected");
                    break;

                case 5:
                    System.out.println("Load from File selected");
                    break;

                case 6:
                    System.out.println("Application closed");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }

    static void addEmployeeMenu() {

        int choice;

        do {
            System.out.println("\n----- Add Employee -----");
            System.out.println("1. Manager");
            System.out.println("2. Engineer");
            System.out.println("3. Sales Person");
            System.out.println("4. Exit to Main Menu");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Employee Name: ");
                String name = sc.next();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                if (choice == 1) {
                    employeeList.add(new Manager(id, name, salary));
                } else if (choice == 2) {
                    employeeList.add(new Engineer(id, name, salary));
                } else {
                    employeeList.add(new SalesPerson(id, name, salary));
                }

                System.out.println("Employee added successfully");
            }

        } while (choice != 4);
    }

    static void displayMenu() {

        int choice;

        do {
            System.out.println("\n----- Display -----");
            System.out.println("1. All Employees");
            System.out.println("2. First Employee");
            System.out.println("3. Next Employee");
            System.out.println("4. Previous Employee");
            System.out.println("5. Last Employee");
            System.out.println("6. Exit to Main Menu");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    employeeList.displayAll();
                    break;

                case 2:
                    employeeList.first();
                    break;

                case 3:
                    employeeList.next();
                    break;

                case 4:
                    employeeList.previous();
                    break;

                case 5:
                    employeeList.last();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }

    static void sortMenu() {

        int choice;

        do {
            System.out.println("\n----- Sort -----");
            System.out.println("1. All Managers");
            System.out.println("2. All Engineers");
            System.out.println("3. All Sales Person");
            System.out.println("4. All Employees Alphabetic Ascending");
            System.out.println("5. All Employees Alphabetic Descending");
            System.out.println("6. Exit to Main Menu");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    employeeList.displayManagers();
                    break;

                case 2:
                    employeeList.displayEngineers();
                    break;

                case 3:
                    employeeList.displaySalesPersons();
                    break;

                case 4:
                    employeeList.sortAscending();
                    break;

                case 5:
                    employeeList.sortDescending();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}