package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        employee.setPerformance(1);
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
        employee.setDaysAbsent(100);
        assertThat(employee.getDaysAbsent()).isEqualTo(100);
    }

    @Test
    void testIsTeamleader()
    {
        employee.setTeamleader(true);
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

    @Test
    void testSetDaysAbsent()
    {
        employee.setDaysAbsent(50);
        assertThat(employee.getDaysAbsent()).isEqualTo(50);
    }

    @Test
    void testSetTeamleader()
    {
        employee.setTeamleader(false);
        assertThat(employee.isTeamleader()).isFalse();
    }

    @Test
    void testCheckValidValues()
    {
        assertThat(employee.checkValidValues(0,0,0,0 )).isTrue() ;

    }

    @Test
    void testThrowsWhenCompanyAffiliationToLow()
    {
        assertThrows(IllegalArgumentException.class, () -> employee.checkValidValues(-1, 0, 0, 0));
        //assertThat(employee.checkValidValues(-1, 0, 0, 0)).isFalse();
    }

    @Test
    void testThrowsWhenCompanyAffiliationToHigh()
    {
        assertThrows(IllegalArgumentException.class, () -> employee.checkValidValues(51, 0, 0, 0));
    }

    @Test
    void testThrowWhenPerformanceToLow()
    {
        assertThrows(IllegalArgumentException.class, () -> employee.checkValidValues(0, -1 , 0, 0));
    }

    @Test
    void testThrowWhenPerformanceToHigh()
    {
        assertThrows(IllegalArgumentException.class, () -> employee.checkValidValues(0, 11 , 0, 0));
    }

    @Test
    void testThrowWhenCompletedProjectsToLow()
    {
        assertThrows(IllegalArgumentException.class, () -> employee.checkValidValues(0, 0 , -1, 0));
    }

}