package EmpolyeeAssinment;

public class SalesPerson extends Employee {
    public SalesPerson(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String getType() {
        return "Sales Person";
    }
}
