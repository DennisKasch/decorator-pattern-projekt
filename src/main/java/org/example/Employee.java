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
        return "Hans";
    }

    public void setFirstname(String firstname)
    {
    }

    public String getLastname()
    {
        return "Müller";
    }

    public void setLastname(String lastname)
    {
    }

    public int getCompanyAffiliation()
    {
        return 7;
    }

    public void setCompanyAffiliation(int companyAffiliation)
    {
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
        return 3;
    }

    public void setCompletedProjects(int completedProjects)
    {
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
