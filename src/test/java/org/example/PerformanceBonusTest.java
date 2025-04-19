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
}