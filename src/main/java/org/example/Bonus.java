package org.example;

public abstract class Bonus
{
    protected double bonus;

    public Bonus(double bonus)
    {
        this.bonus = 10.;
    }

    public abstract double bonusBerechnen();

    //Method was added for TDD purposes.
    public double getBonus() {
        return bonus;
    }
}
