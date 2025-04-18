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

}