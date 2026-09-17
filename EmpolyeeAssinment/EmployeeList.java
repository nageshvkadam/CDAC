package EmpolyeeAssinment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {

    Employee[] employees = new Employee[100];
    int count = 0;
    int current = 0;

    public void add(Employee employee) {
        if (count == employees.length) {
            System.out.println("Employee list is full");
            return;
        }

        employees[count] = employee;
        count++;

        System.out.println("Employee added successfully");
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No employees found");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void first() {
        if (count == 0) {
            System.out.println("No employees found");
            return;
        }

        current = 0;
        System.out.println(employees[current]);
    }

    public void next() {
        if (count == 0) {
            System.out.println("No employees found");
        } else if (current == count - 1) {
            System.out.println("Already at last employee");
        } else {
            current++;
            System.out.println(employees[current]);
        }
    }

    public void previous() {
        if (count == 0) {
            System.out.println("No employees found");
        } else if (current == 0) {
            System.out.println("Already at first employee");
        } else {
            current--;
            System.out.println(employees[current]);
        }
    }

    public void last() {
        if (count == 0) {
            System.out.println("No employees found");
            return;
        }

        current = count - 1;
        System.out.println(employees[current]);
    }

    public void displayManagers() {
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof Manager) {
                System.out.println(employees[i]);
            }
        }
    }

    public void displayEngineers() {
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof Engineer) {
                System.out.println(employees[i]);
            }
        }
    }

    public void displaySalesPersons() {
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof SalesPerson) {
                System.out.println(employees[i]);
            }
        }
    }

    public void sortAscending() {
        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(employees[i]);
        }

        Collections.sort(list, Comparator.comparing(Employee::getName));

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public void sortDescending() {
        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(employees[i]);
        }

        Collections.sort(list, Comparator.comparing(Employee::getName).reversed());

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}