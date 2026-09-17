package EmpolyeeAssinment;

public class Manager extends Employee {
    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String getType() {
        return "Manager";
    }
}