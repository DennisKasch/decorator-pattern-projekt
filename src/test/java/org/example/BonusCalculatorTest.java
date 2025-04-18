package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class BonusCalculatorTest {


    @Test
    void testValidConstructor()
    {
        Employee employee = mock(Employee.class);
        BonusService bonusService = mock(BonusService.class);

        BonusCalculator bonusCalculator = new BonusCalculator(employee, bonusService);

        assertThat(bonusCalculator.getBonusService()).isEqualTo(bonusService);
        assertThat(bonusCalculator.getEmployee()).isEqualTo(employee);
    }

    @Test
    void testCalculateBonus_ProjectCompletionBonus()
    {
        Employee employee = mock(Employee.class);
        BonusService bonusService = mock(BonusService.class);

        when(employee.getCompletedProjects()).thenReturn(20);
        when(employee.getDaysAbsent()).thenReturn(15);

        BonusCalculator bonusCalculator = new BonusCalculator(employee, bonusService);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(1)).getCompletedProjects();
    }

    @Test
    void testCalculateBonus_DaysAbsentBonus_3DaysAbsent_LowPerformance()
    {
        Employee employee = mock(Employee.class);
        BonusService bonusService = mock(BonusService.class);

        employee.setDaysAbsent(3);
        employee.setPerformance(1);

        BonusCalculator bonusCalculator = new BonusCalculator(employee, bonusService);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(150);

        verify(employee, times(1)).getDaysAbsent();
        verify(employee, times(1)).getPerformance();
    }
}