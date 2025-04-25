package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        verify(employee, times(2)).getPerformance();
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

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(1)).isTeamleader();
        verify(teamleaderBonus, times(1)).calculateBonus();
    }

    @Test
    void testGetCorrectBonus_BonusService()
    {
        when(bonusService.calculateCorrectBonus(0.)).thenReturn(50.);

        assertThat(bonusCalculator.getCorrectBonus()).isEqualTo(50);

        verify(bonusService, times(1)).calculateCorrectBonus(0.);
    }

    @Test
    void testCalculateBonus_BaseBonus()
    {
        BaseBonus baseBonus = mock(BaseBonus.class);
        bonusCalculator.setBaseBonus(baseBonus);
        when(baseBonus.calculateBonus()).thenReturn(100.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(baseBonus, times(1)).calculateBonus();
    }

    @Test
    void testCalcuateBonus_PerformanceBonus()
    {
        PerformanceBonus performanceBonus = mock(PerformanceBonus.class);
        bonusCalculator.setPerformanceBonus(performanceBonus);
        when(performanceBonus.calculateBonus()).thenReturn(100.);

        assertThat(bonusCalculator.calculateBonus()).isEqualTo(100);

        verify(employee, times(2)).getPerformance();
        verify(performanceBonus, times(1)).calculateBonus();
    }
}