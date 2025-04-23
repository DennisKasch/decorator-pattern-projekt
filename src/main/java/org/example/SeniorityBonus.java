package org.example;

public class SeniorityBonus extends Bonus {


    private int companyAffiliation;

    public SeniorityBonus(double bonus, int companyAffiliation)
    {
        super(0);
    }
    @Override
    public double calculateBonus() {
        return 0;
    }
}
