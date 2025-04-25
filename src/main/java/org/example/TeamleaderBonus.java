package org.example;

public class TeamleaderBonus extends Bonus{

    private boolean teamLeader;

    public boolean isTeamLeader() {
        return teamLeader;
    }

    public TeamleaderBonus(double bonus, boolean teamLeader)
    {
        super(bonus);
        this.teamLeader = teamLeader;
    }
    @Override
    public double calculateBonus() {
        if(teamLeader) {
            return 100;
        }
        else {
            return 0;
        }
    }
}
