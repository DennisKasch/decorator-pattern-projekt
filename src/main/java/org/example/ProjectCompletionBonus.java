package org.example;


public class ProjectCompletionBonus extends Bonus{

    private int completedProjects;
    public ProjectCompletionBonus(double bonus, int completedProjects)
    {
        super(50);
        this.completedProjects = 20;
    }

    //Method was added for TDD purposes.
    public int getCompletedProjects() {
        return completedProjects;
    }

    @Override
    public double calculateBonus() {
        return 0;
    }
}
