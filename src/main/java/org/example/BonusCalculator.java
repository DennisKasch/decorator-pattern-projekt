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
        double bonusSum = 0.;

        ProjectCompletionBonus projectCompletionBonus =
                new ProjectCompletionBonus(5, employee.getCompletedProjects());
        DaysAbsentBonus daysAbsentBonus =
                new DaysAbsentBonus(100, employee.getDaysAbsent(), employee.getPerformance());

        bonusSum += projectCompletionBonus.calculateBonus();
        bonusSum += daysAbsentBonus.calculateBonus();
        return bonusSum;
    }
}
