package org.example;

public class BonusCalculator {
    private Employee employee;
    private BonusService bonusService;

    public BonusCalculator(Employee employee, BonusService bonusService)
    {

    }

    public Employee getEmployee() {
        return employee;
    }

    public BonusService getBonusService() {
        return bonusService;
    }

    public double calculateBonus()
    {
        return 0;
    }
}
