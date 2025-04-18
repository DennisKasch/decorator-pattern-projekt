package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class BonusCalculatorTest {

    Employee employee;
    BonusService bonusService;
    BonusCalculator bonusCalculator;
    @BeforeEach
    void setUp()
    {
        employee = mock(Employee.class);
        bonusService = mock(BonusService.class);

        bonusCalculator = new BonusCalculator(employee, bonusService);
    }

    @Test
    void testValidConstructor()
    {

        assertThat(bonusCalculator.getBonusService()).isEqualTo(bonusService);
        assertThat(bonusCalculator.getEmployee()).isEqualTo(employee);
    }

    @Test
    void testCalculateBonus_ProjectCompletionBonus()
    {
        when(employee.getCompletedProjects()).thenReturn(20);
        when(employee.getDaysAbsent()).thenReturn(15);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(1)).getCompletedProjects();
    }

    @Test
    void testCalculateBonus_DaysAbsentBonus_3DaysAbsent_LowPerformance()
    {
        employee.setDaysAbsent(3);
        employee.setPerformance(1);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(150);

        verify(employee, times(1)).getDaysAbsent();
        verify(employee, times(1)).getPerformance();
    }
}