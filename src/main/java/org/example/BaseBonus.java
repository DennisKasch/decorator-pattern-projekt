package org.example;

public class BaseBonus extends Bonus
{
    private static final double BASE_AMOUNT = 1000.0;

    public BaseBonus()
    {
        super(BASE_AMOUNT);
    }

    @Override
    public double calculateBonus()
    {
        return bonus;
    }
}
