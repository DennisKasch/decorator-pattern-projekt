package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DaysAbsentBonusTest {
    private DaysAbsentBonus daysAbsentBonus;
    @BeforeEach
    void setUp()
    {
        daysAbsentBonus = new DaysAbsentBonus(100, 15, 20);
    }

    @Test
    void testValidConstructor()
    {
        //use same values as in setUp
        assertThat(daysAbsentBonus.getBonus()).isEqualTo(100);
        assertThat(daysAbsentBonus.getDaysAbsent()).isEqualTo(15);
        assertThat(daysAbsentBonus.getPerformance()).isEqualTo(20);
    }

}