package org.example;

public class BonusCalculator {
    private Employee employee;
    private BonusService bonusService;

    private BaseBonus baseBonus;
    private DaysAbsentBonus daysAbsentBonus;
    private PerformanceBonus performanceBonus;
    private ProjectCompletionBonus projectCompletionBonus;
    private SeniorityBonus seniorityBonus;
    private TeamleaderBonus teamleaderBonus;

    public BonusCalculator(Employee employee, BonusService bonusService)
    {
        this.employee = employee;
        this.bonusService = bonusService;

        baseBonus = new BaseBonus();
        daysAbsentBonus = new DaysAbsentBonus(0, employee.getDaysAbsent(), employee.getPerformance());
        projectCompletionBonus = new ProjectCompletionBonus(0, employee.getCompletedProjects());
        seniorityBonus = new SeniorityBonus(0, employee.getCompanyAffiliation());
        teamleaderBonus = new TeamleaderBonus(0, employee.isTeamleader());
    }

    public double calculateBonus()
    {
        double bonusSum = 0.;

        bonusSum += projectCompletionBonus.calculateBonus();
        bonusSum += daysAbsentBonus.calculateBonus();
        bonusSum += seniorityBonus.calculateBonus();
        bonusSum += teamleaderBonus.calculateBonus();
        return bonusSum;
    }


    public Employee getEmployee() {
        return employee;
    }

    public BonusService getBonusService() {
        return bonusService;
    }

    public void setBaseBonus(BaseBonus baseBonus) {
        this.baseBonus = baseBonus;
    }

    public void setDaysAbsentBonus(DaysAbsentBonus daysAbsentBonus) {
        this.daysAbsentBonus = daysAbsentBonus;
    }

    public void setPerformanceBonus(PerformanceBonus performanceBonus) {
        this.performanceBonus = performanceBonus;
    }

    public void setProjectCompletionBonus(ProjectCompletionBonus projectCompletionBonus) {
        this.projectCompletionBonus = projectCompletionBonus;
    }

    public void setSeniorityBonus(SeniorityBonus seniorityBonus) {
        this.seniorityBonus = seniorityBonus;
    }

    public void setTeamleaderBonus(TeamleaderBonus teamleaderBonus) {
        this.teamleaderBonus = teamleaderBonus;
    }
}
