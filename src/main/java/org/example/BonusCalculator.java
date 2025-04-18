package org.example;

public class BonusCalculator {
    private Employee employee;
    private BonusService bonusService;

    public BonusCalculator(Employee employee, BonusService bonusService)
    {
        this.employee = employee;
        this.bonusService = bonusService;
    }

    public Employee getEmployee() {
        return employee;
    }

    public BonusService getBonusService() {
        return bonusService;
    }

    public double calculateBonus()
    {
        employee.getCompletedProjects();
        return 100;
    }
}
