package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SeniorityBonusTest {

    private SeniorityBonus seniorityBonus;
    @Test
    void testValidConstructor() {
        seniorityBonus = new SeniorityBonus(100, 5);

        assertThat(seniorityBonus.getBonus()).isEqualTo(100);
        assertThat(seniorityBonus.getCompanyAffiliation()).isEqualTo(5);
    }

    @Test
    void testCalculateBonus_FiveYearAffiliation() {
        seniorityBonus = new SeniorityBonus(100, 5);
        int expectedBonus = 100;
        assertThat(seniorityBonus.calculateBonus()).isEqualTo(expectedBonus);
    }

}