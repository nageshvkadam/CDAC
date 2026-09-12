package Class;
class Student {

    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String[] args) {

        // Part (a)
        Student student1 = new Student();

        student1.roll_no = 2;
        student1.name = "John";

        System.out.println("Part A:");
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No: " + student1.roll_no);


        // Part (b)
        Student student2 = new Student();
        Student student3 = new Student();

        // Student Sam
        student2.name = "Sam";
        student2.roll_no = 1;
        student2.phone_no = "9876543210";
        student2.address = "Pune";

        // Student John
        student3.name = "John";
        student3.roll_no = 2;
        student3.phone_no = "9123456780";
        student3.address = "Mumbai";


        System.out.println("\nPart B:");

        System.out.println("Student 1:");
        System.out.println("Name: " + student2.name);
        System.out.println("Roll No: " + student2.roll_no);
        System.out.println("Phone No: " + student2.phone_no);
        System.out.println("Address: " + student2.address);

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("Name: " + student3.name);
        System.out.println("Roll No: " + student3.roll_no);
        System.out.println("Phone No: " + student3.phone_no);
        System.out.println("Address: " + student3.address);
    }
}