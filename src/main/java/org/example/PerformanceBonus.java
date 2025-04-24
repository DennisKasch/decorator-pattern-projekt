package org.example;

public class PerformanceBonus extends Bonus
{
    private final int performance;
    public PerformanceBonus(double bonus, int performance)
    {
        super(bonus);
        this.performance = performance;
    }

    @Override
    public double calculateBonus()
    {
        return bonus * 0.8;
    }
}
