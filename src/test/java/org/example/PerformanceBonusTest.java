package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceBonusTest
{
    @Test
    void shouldReduceBonusIfPerformanceLow()
    {
        PerformanceBonus low = new PerformanceBonus(1000, 2);
        assertThat(low.calculateBonus()).isEqualTo(800);
    }

    @Test
    void shouldKeepBonusIfPerformanceMedium()
    {
        PerformanceBonus medium = new PerformanceBonus(1000, 5);
        assertThat(medium.calculateBonus()).isEqualTo(1000);
    }
}