public abstract class Employee {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected int basicSalary;

    public Employee(String name, String address, int basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }

    public abstract int calculateMonthlySalary();
}
