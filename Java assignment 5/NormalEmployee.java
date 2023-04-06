public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String address, int basicSalary) {
        super(name, address, basicSalary);
    }

    @Override
    public int calculateMonthlySalary() {
        return basicSalary / 12;
    }
}
