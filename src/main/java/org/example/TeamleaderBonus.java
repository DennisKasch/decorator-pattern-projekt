package org.example;

public class TeamleaderBonus extends Bonus{

    private boolean teamLeader;

    public boolean isTeamLeader() {
        return teamLeader;
    }

    public TeamleaderBonus(double bonus, boolean teamLeader)
    {
        super(0);
    }
    @Override
    public double calculateBonus() {
        return 0;
    }
}
