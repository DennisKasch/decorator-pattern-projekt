package org.example;

public class Employee {

    private String firstname;
    private String lastname;
    private int companyAffiliation;
    private int performance;
    private int completedProjects;
    private int daysAbsent;
    private boolean isTeamleader;

    public Employee(String firstname, String lastname, int companyAffiliation, int performance, int completedProjects, int daysAbsent, boolean isTeamleader) {
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
        return 0;
    }

    public void setPerformance(int performance)
    {
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
        return 100;
    }

    public void setDaysAbsent(int daysAbsent)
    {
    }

    public boolean isTeamleader()
    {
        return true;
    }

    public void setTeamleader(boolean teamleader)
    {
    }
}
