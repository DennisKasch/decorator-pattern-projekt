package org.example;

public class SeniorityBonus extends Bonus {

    private int companyAffiliation;

    public SeniorityBonus(double bonus, int companyAffiliation)
    {
        super(0);
    }

    public int getCompanyAffiliation() {
        return companyAffiliation;
    }

    public void setCompanyAffiliation(int companyAffiliation) {
        this.companyAffiliation = companyAffiliation;
    }

    @Override
    public double calculateBonus() {
        return 0;
    }
}
