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
}