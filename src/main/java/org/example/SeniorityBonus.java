package org.example;

public class SeniorityBonus extends Bonus {

    private int companyAffiliation;

    public SeniorityBonus(double bonus, int companyAffiliation)
    {
        super(bonus);
        this.companyAffiliation = companyAffiliation;
    }

    public int getCompanyAffiliation() {
        return companyAffiliation;
    }

    public void setCompanyAffiliation(int companyAffiliation) {
        this.companyAffiliation = companyAffiliation;
    }

    @Override
    public double calculateBonus() {
        if(companyAffiliation >= 10) {
            return 200;
        }
        if(companyAffiliation >= 5){
            return 100;
        }
        else {
            return 0;
        }
    }
}
