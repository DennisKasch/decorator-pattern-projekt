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
        assertThat(employee.getFirstname()).isEqualTo("Hans");
    }

    @Test
    void testGetLastname()
    {
        assertThat(employee.getLastname()).isEqualTo("Müller");
    }

    @Test
    void testGetCompanyAffiliation()
    {
        assertThat(employee.getCompanyAffiliation()).isEqualTo(7);
    }

    @Test
    void testGetCompletedProjects()
    {
        assertThat(employee.getCompletedProjects()).isEqualTo(3);
    }


    @Test
    void testGetDaysAbsent()
    {
        assertThat(employee.getDaysAbsent()).isEqualTo(100);
    }

}