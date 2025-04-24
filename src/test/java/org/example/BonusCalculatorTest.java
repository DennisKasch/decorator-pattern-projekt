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
        ProjectCompletionBonus projectCompletionBonus = mock(ProjectCompletionBonus.class);
        bonusCalculator.setProjectCompletionBonus(projectCompletionBonus);
        when(projectCompletionBonus.calculateBonus()).thenReturn(100.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(1)).getCompletedProjects();
        verify(projectCompletionBonus, times(1)).calculateBonus();
    }

    @Test
    void testCalculateBonus_DaysAbsentBonus()
    {
        DaysAbsentBonus daysAbsentBonus = mock(DaysAbsentBonus.class);
        bonusCalculator.setDaysAbsentBonus(daysAbsentBonus);
        when(daysAbsentBonus.calculateBonus()).thenReturn(100.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(1)).getDaysAbsent();
        verify(employee, times(1)).getPerformance();
        verify(daysAbsentBonus, times(1)).calculateBonus();
    }

    @Test
    void testCalculateBonus_SeniorityBonus()
    {
        SeniorityBonus seniorityBonus = mock(SeniorityBonus.class);
        bonusCalculator.setSeniorityBonus(seniorityBonus);
        when(seniorityBonus.calculateBonus()).thenReturn(100.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(1)).getCompanyAffiliation();
        verify(seniorityBonus, times(1)).calculateBonus();
    }

    @Test
    void testCalculateBonus_TeamLeaderBonus()
    {
        TeamleaderBonus teamleaderBonus = mock(TeamleaderBonus.class);
        bonusCalculator.setTeamleaderBonus(teamleaderBonus);
        when(teamleaderBonus.calculateBonus()).thenReturn(100.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100.);

        verify(employee, times(1)).isTeamleader();
        verify(teamleaderBonus, times(1)).calculateBonus();
    }

    @Test
    void testCalculateBonus_BonusService()
    {
        when(bonusService.calculateCorrectBonus(0.)).thenReturn(50.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(50);

        verify(bonusService, times(1)).calculateCorrectBonus(0.);
    }
}