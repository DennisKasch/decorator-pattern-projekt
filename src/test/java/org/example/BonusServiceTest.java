package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    private BonusService bonusService;

    @Test
    void testValidConstructor() {
        bonusService = new BonusService(0, 100);

        assertThat(bonusService.getMinimumValue()).isEqualTo(0);
        assertThat(bonusService.getMaximumValue()).isEqualTo(100);
    }

    @Test
    void testCorrectCalculateBonus_AllZero() {
        bonusService = new BonusService(0, 0);
        int expectedBonus = 0;

        assertThat(bonusService.calculateCorrectBonus(0)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_MaximumBonus() {
        bonusService = new BonusService(1200, 0);
        int expectedBonus = 1200;

        assertThat(bonusService.calculateCorrectBonus(1200)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_OverMaximumBonus() {
        bonusService = new BonusService(1300, 0);
        int expectedBonus = 1200;

        assertThat(bonusService.calculateCorrectBonus(1300)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_UnderMaximumBonus() {
        bonusService = new BonusService(900, 0);
        int expectedBonus = 900;

        assertThat(bonusService.calculateCorrectBonus(900)).isEqualTo(expectedBonus);
    }
}