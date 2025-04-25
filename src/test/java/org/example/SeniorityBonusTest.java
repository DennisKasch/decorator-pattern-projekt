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
    void testCalculateBonus_ZeroYearAffiliation() {
        seniorityBonus = new SeniorityBonus(0, 0);
        int expectedBonus = 0;
        assertThat(seniorityBonus.calculateBonus()).isEqualTo(expectedBonus);
    }

    @Test
    void testCalculateBonus_FiveYearAffiliation() {
        seniorityBonus = new SeniorityBonus(100, 5);
        int expectedBonus = 100;
        assertThat(seniorityBonus.calculateBonus()).isEqualTo(expectedBonus);
    }

    @Test
    void testCalculateBonus_SevenYearAffiliation() {
        seniorityBonus = new SeniorityBonus(100, 7);
        int expectedBonus = 100;
        assertThat(seniorityBonus.calculateBonus()).isEqualTo(expectedBonus);
    }

    @Test
    void testCalculateBonus_TenYearAffiliation() {
        seniorityBonus = new SeniorityBonus(200, 10);
        int expectedBonus = 200;
        assertThat(seniorityBonus.calculateBonus()).isEqualTo(expectedBonus);
    }

    @Test
    void testCalculateBonus_ElevenYearAffiliation() {
        seniorityBonus = new SeniorityBonus(200, 11);
        int expectedBonus = 200;
        assertThat(seniorityBonus.calculateBonus()).isEqualTo(expectedBonus);
    }
}