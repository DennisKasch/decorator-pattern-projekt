package org.example;

public class Employee {

    private String firstname;
    private String lastname;
    private int companyAffiliation;
    private int performance;
    private int completedProjects;
    private int daysAbsent;
    private boolean isTeamleader;

    public Employee(String firstname, String lastname, int companyAffiliation, int performance, int completedProjects, int daysAbsent, boolean isTeamleader)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.companyAffiliation = companyAffiliation;
        this.performance = performance;
        this.completedProjects = completedProjects;
        this.daysAbsent = daysAbsent;
        this.isTeamleader = isTeamleader;

        checkValidValues(companyAffiliation, performance, completedProjects, daysAbsent);
    }
    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public int getCompanyAffiliation()
    {
        return companyAffiliation;
    }

    public void setCompanyAffiliation(int companyAffiliation)
    {
        this.companyAffiliation = companyAffiliation;

        checkValidValues(companyAffiliation, 0, 0,0);
    }

    public int getPerformance()
    {
        return performance;
    }

    public void setPerformance(int performance)
    {
        this.performance = performance;
        checkValidValues(0, performance, 0, 0);
    }

    public int getCompletedProjects()
    {
        return completedProjects;
    }

    public void setCompletedProjects(int completedProjects)
    {
        this.completedProjects = completedProjects;
        checkValidValues(0, 0, completedProjects, 0);
    }

    public int getDaysAbsent()
    {
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent)
    {
        this.daysAbsent = daysAbsent;
        checkValidValues(0, 0, 0, daysAbsent);
    }

    public boolean isTeamleader()
    {
        return isTeamleader;
    }

    public void setTeamleader(boolean teamleader)
    {
        this.isTeamleader = teamleader;
    }

    public boolean checkValidValues(int companyAffiliation, int performance, int completedProjects,  int daysAbsent)
    {
        boolean cA = companyAffiliation < 0 || companyAffiliation > 50;
        boolean p = performance < 0 || performance > 10;
        boolean cP = completedProjects < 0 || completedProjects > 250;
        boolean dA = daysAbsent < 0 || daysAbsent > 30;
        if(cA || p || cP || dA)
        {
            throw new IllegalArgumentException("companyAffiliation out of range");
        }

       return true;
    }
}
