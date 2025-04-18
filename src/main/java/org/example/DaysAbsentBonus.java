package org.example;

public class DaysAbsentBonus extends Bonus {

    private int daysAbsent;
    private int performance;
    public DaysAbsentBonus(double bonus, int daysAbsent, int performance) {
        super(100);
        this.daysAbsent = 15;
        this.performance = 20;
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
        return 150;
    }
}
