package EmpolyeeAssinment;

public class Node {
    Employee employee;
    Node prev;
    Node next;

    public Node(Employee employee) {
        this.employee = employee;
    }
}