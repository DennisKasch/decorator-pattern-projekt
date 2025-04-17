package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class EmployeeTest
{
    private Employee employee;
    @BeforeEach
    void setUp()
    {
        employee = new Employee("Hans", "Müller", 0, 0, 0, 0, false);
    }

    @Test
    void testGetFirstname()
    {
        employee.setFirstname("Hans");
        assertThat(employee.getFirstname()).isEqualTo("Hans");
    }

    @Test
    void testGetLastname()
    {
        employee.setLastname("Müller");
        assertThat(employee.getLastname()).isEqualTo("Müller");
    }

    @Test
    void testGetCompanyAffiliation()
    {
        employee.setCompanyAffiliation(7);
        assertThat(employee.getCompanyAffiliation()).isEqualTo(7);
    }

    @Test
    void testGetPerformance()
    {
        assertThat(employee.getPerformance()).isEqualTo(1);
    }

    @Test
    void testGetCompletedProjects()
    {
        employee.setCompletedProjects(3);
        assertThat(employee.getCompletedProjects()).isEqualTo(3);
    }


    @Test
    void testGetDaysAbsent()
    {
        assertThat(employee.getDaysAbsent()).isEqualTo(100);
    }

    @Test
    void testIsTeamleader()
    {
        assertThat(employee.isTeamleader()).isTrue();
    }

    @Test
    void testSetFirstname()
    {
        employee.setFirstname("Alice");
        assertThat(employee.getFirstname()).isEqualTo("Alice");
    }

    @Test
    void testSetLastname()
    {
        employee.setLastname("Schmidt");
        assertThat(employee.getLastname()).isEqualTo("Schmidt");
    }

    @Test
    void testSetCompanyAffiliation()
    {
        employee.setCompanyAffiliation(35);
        assertThat(employee.getCompanyAffiliation()).isEqualTo(35);
    }

    @Test
    void testSetPerformance()
    {
        employee.setPerformance(5);
        assertThat(employee.getPerformance()).isEqualTo(5);
    }

    @Test
    void testSetCompletedProjects()
    {
        employee.setCompletedProjects(10);
        assertThat(employee.getCompletedProjects()).isEqualTo(10);
    }

}