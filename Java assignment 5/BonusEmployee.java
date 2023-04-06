public class BonusEmployee extends Employee {
    private int monthlyBonus;

    public BonusEmployee(String name, String address, int basicSalary, int monthlyBonus) {
        super(name, address, basicSalary);
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return (basicSalary / 12) + monthlyBonus;
    }

    // Getter and setter for monthlyBonus
}