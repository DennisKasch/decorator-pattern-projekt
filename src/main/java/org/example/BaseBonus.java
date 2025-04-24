package org.example;

public class BaseBonus extends Bonus
{
    public BaseBonus(double bonus)
    {
        super(bonus);
    }

    @Override
    public double calculateBonus()
    {
        return bonus;
    }
}
