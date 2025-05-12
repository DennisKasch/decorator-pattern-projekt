package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BonusServiceTest {
    private BonusService bonusService;

    @Test
    void testAttributeValues() {
        bonusService = new BonusService();

        assertThat(bonusService.getMinimumValue()).isEqualTo(0);
        assertThat(bonusService.getMaximumValue()).isEqualTo(1500);
    }

    @Test
    void testCorrectCalculateBonus_AllZero() {
        bonusService = new BonusService();
        int expectedBonus = 0;

        assertThat(bonusService.calculateCorrectBonus(0)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_MaximumBonus() {
        bonusService = new BonusService();
        int expectedBonus = 1200;

        assertThat(bonusService.calculateCorrectBonus(1200)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_OverMaximumBonus() {
        bonusService = new BonusService();
        int expectedBonus = 1500;

        assertThat(bonusService.calculateCorrectBonus(1600)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_UnderMaximumBonus() {
        bonusService = new BonusService();
        int expectedBonus = 900;

        assertThat(bonusService.calculateCorrectBonus(900)).isEqualTo(expectedBonus);
    }

    @Test
    void testCorrectCalculateBonus_UnderMinimum() {
        bonusService = new BonusService();
        int expectedBonus = 0;

        assertThat(bonusService.calculateCorrectBonus(-200)).isEqualTo(expectedBonus);
    }
}