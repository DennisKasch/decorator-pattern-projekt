package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceBonusTest
{
    @Test
    void shouldApplyFactor1_0ForPerformanceBelow7()
    {
        Employee employee = new Employee("Max", "Mustermann", 3, 6, 5, 2, false);
        Bonus baseBonus = new BaseBonus();
        Bonus performanceBonus = new PerformanceBonus(baseBonus, employee);

        double result = performanceBonus.calculateBonus();

        assertThat(result).isEqualTo(1000.0);
    }

    @Test
    void shouldApplyFactor1_2ForPerformanceBetween7And8()
    {
        Employee employee = new Employee("Eva", "Schmidt", 4, 7, 10, 3, false);
        Bonus baseBonus = new BaseBonus();
        Bonus performanceBonus = new PerformanceBonus(baseBonus, employee);

        double result = performanceBonus.calculateBonus();

        assertThat(result).isEqualTo(1200.0);
    }

    @Test
    void shouldApplyFactor1_5ForPerformanceAbove8()
    {
        Employee employee = new Employee("Nora", "Miller", 2, 9, 6, 0, false);
        Bonus baseBonus = new BaseBonus();
        Bonus performanceBonus = new PerformanceBonus(baseBonus, employee);

        double result = performanceBonus.calculateBonus();

        assertThat(result).isEqualTo(1500.0);
    }
}