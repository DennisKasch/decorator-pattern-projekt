package org.example;

public class PerformanceBonus extends Bonus
{
    private final Bonus decoratedBonus;
    private final Employee employee;

    public PerformanceBonus(Bonus decoratedBonus, Employee employee)
    {
        super(decoratedBonus.getBonus());
        this.decoratedBonus = decoratedBonus;
        this.employee = employee;
    }

    @Override
    public double calculateBonus()
    {
        double base = decoratedBonus.calculateBonus();
        int performance = employee.getPerformance();

        double factor = 0;

        if(performance <= 6)
        {
            factor = 1.0;
        }
        else if(performance <= 8)
        {
            factor = 1.2;
        }

        bonus = base * factor;
        return  bonus;
    }
}
