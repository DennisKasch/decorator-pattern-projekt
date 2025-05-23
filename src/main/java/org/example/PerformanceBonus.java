package org.example;

public class PerformanceBonus extends Bonus
{
    private int performance;
    public PerformanceBonus(double bonus, int performance)
    {
        super(bonus);
        this.performance = performance;
    }

    @Override
    public double calculateBonus()
    {
        if(performance <= 3)
        {
            bonus =  bonus * 0.8;
        }
        else if (performance <= 7)
        {
            bonus = bonus * 1;
        }
        else
        {
            bonus = bonus * 1.2;
        }
        return bonus;
    }
}
