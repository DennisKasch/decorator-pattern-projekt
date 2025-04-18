package org.example;


public class ProjectCompletionBonus extends Bonus{

    private int completedProjects;
    public ProjectCompletionBonus(double bonus, int completedProjects)
    {
        super(bonus);
        this.completedProjects = completedProjects;
    }

    //Method was added for TDD purposes.
    public int getCompletedProjects() {
        return completedProjects;
    }

    @Override
    public double calculateBonus() {
        return bonus * completedProjects;
    }
}
