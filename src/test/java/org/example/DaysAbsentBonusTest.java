package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DaysAbsentBonusTest {
    private DaysAbsentBonus daysAbsentBonus;

    @Test
    void testValidConstructor()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 15, 20);

        //use same values as in setUp
        assertThat(daysAbsentBonus.getBonus()).isEqualTo(100);
        assertThat(daysAbsentBonus.getDaysAbsent()).isEqualTo(15);
        assertThat(daysAbsentBonus.getPerformance()).isEqualTo(20);
    }

    @Test
    void testCalculateBonus_LowDaysAbsent_LowPerformance()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 5, 3);
        double expectedDaysAbsentBonus = 150;
        assertThat(daysAbsentBonus.calculateBonus()).isEqualTo(expectedDaysAbsentBonus);
    }

    @Test
    void testCalculateBonus_LowDaysAbsent_MidPerformance()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 3, 5);
        double expectedDaysAbsentBonus = 225;
        assertThat(daysAbsentBonus.calculateBonus()).isEqualTo(expectedDaysAbsentBonus);
    }

    @Test
    void testCalculateBonus_LowDaysAbsent_HighPerformance()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 3, 8);
        double expectedDaysAbsentBonus = 337.5;
        assertThat(daysAbsentBonus.calculateBonus()).isEqualTo(expectedDaysAbsentBonus);
    }

    @Test
    void testCalculateBonus_HighDaysAbsent_20Days()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 20, 8);
        double expectedDaysAbsentBonus = -50;
        assertThat(daysAbsentBonus.calculateBonus()).isEqualTo(expectedDaysAbsentBonus);
    }

    @Test
    void testCalculateBonus_HighDaysAbsent_25Days()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 25, 8);
        double expectedDaysAbsentBonus = -100;
        assertThat(daysAbsentBonus.calculateBonus()).isEqualTo(expectedDaysAbsentBonus);
    }

    @Test
    void testCalculateBonus_NoBonus()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 15, 8);
        double expectedDaysAbsentBonus = 0;
        assertThat(daysAbsentBonus.calculateBonus()).isEqualTo(expectedDaysAbsentBonus);
    }

}