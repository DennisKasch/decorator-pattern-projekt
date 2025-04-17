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
    }

    public int getPerformance()
    {
        return performance;
    }

    public void setPerformance(int performance)
    {
        this.performance = performance;
    }

    public int getCompletedProjects()
    {
        return completedProjects;
    }

    public void setCompletedProjects(int completedProjects)
    {
        this.completedProjects = completedProjects;
    }

    public int getDaysAbsent()
    {
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent)
    {
        this.daysAbsent = daysAbsent;
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
       return true;
    }
}
