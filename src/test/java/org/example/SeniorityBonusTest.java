package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SeniorityBonusTest {

    private SeniorityBonus seniorityBonus;
    @Test
    void testValidConstructor() {
        seniorityBonus = new SeniorityBonus(20, 5);

        assertThat(seniorityBonus.getBonus()).isEqualTo(20);
        assertThat(seniorityBonus.getCompanyAffiliation()).isEqualTo(5);
    }
}