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

}