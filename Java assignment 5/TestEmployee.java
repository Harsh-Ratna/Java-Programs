public class TestEmployee {
    public static void main(String[] args) {
        NormalEmployee normalEmployee = new NormalEmployee("Harsh Ratna", "123 Sus st", 1200000);
        BonusEmployee bonusEmployee = new BonusEmployee("Abhinav Kumar", "784 park lane", 100000, 20000);

        System.out.println("Normal Employee:");
        System.out.println("Name: " + normalEmployee.getName());
        System.out.println("Address: " + normalEmployee.getAddress());
        System.out.println("Monthly Salary: " + normalEmployee.calculateMonthlySalary());

        System.out.println();

        System.out.println("Bonus Employee:");
        System.out.println("Name: " + bonusEmployee.getName());
        System.out.println("Address: " + bonusEmployee.getAddress());
        System.out.println("Monthly Salary: " + bonusEmployee.calculateMonthlySalary());
    }
}
