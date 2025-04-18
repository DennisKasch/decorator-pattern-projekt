package org.example;

public class DaysAbsentBonus extends Bonus {

    private int daysAbsent;
    private int performance;
    public DaysAbsentBonus(double bonus, int daysAbsent, int performance) {
        super(bonus);
        this.daysAbsent = daysAbsent;
        this.performance = performance;
    }

    //Method was added for TDD purposes.
    public int getDaysAbsent() {
        return daysAbsent;
    }

    //Method was added for TDD purposes.
    public int getPerformance() {
        return performance;
    }

    @Override
    public double calculateBonus() {

        if (daysAbsent <= 5) // low absent days
        {
            return calculateBonusOnLowDaysAbsent();
        }
        else //high absent days
        {
            return calculateBonusOnHighDaysAbsent();
        }
    }

    private double calculateBonusOnLowDaysAbsent()
    {
        double bonusFactor = 1.5;
        double bonusSum = 0;
        if(performance <= 3) //low performance
        {
            bonusSum += bonus * bonusFactor;
        }
        else if(performance <= 7) //mid performance
        {
            bonusSum += bonus * Math.pow(bonusFactor, 2);
        }
        else
        {
            bonusSum += bonus * Math.pow(bonusFactor, 3);
        }

        return bonusSum;
    }

    private double calculateBonusOnHighDaysAbsent()
    {
        double bonusSum = 0;
        if(daysAbsent >= 25)
        {
            bonusSum -= bonus;
        }
        else if(daysAbsent >= 20)
        {
            bonusSum -= bonus * 0.5;
        }

        return bonusSum;
    }
}
