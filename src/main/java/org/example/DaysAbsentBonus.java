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

        double bonusFactor = 1.5;
        double bonusSum = 0.;

        if (daysAbsent <= 5) // low absent days
        {
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
        }
        else //high absent days
        {
            if(daysAbsent >= 20)
            {
                bonusSum -= bonus * 0.5;
            }
        }
        return bonusSum;
    }
}
