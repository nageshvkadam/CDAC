package Class;
class Employeee {

    double salary;
    int hours;

    // getInfo() method
    void getInfo(double salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    // addSal() method
    void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    // addWork() method
    void addWork() {
        if (hours > 6) {
            salary = salary + 5;
        }
    }

    public static void main(String[] args) {

        Employeee emp = new Employeee();

        // Salary = 450, Working hours = 8
        emp.getInfo(450, 8);

        emp.addSal();
        emp.addWork();

        System.out.println("Final Salary: $" + emp.salary);
    }
}