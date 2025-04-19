package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBonusTest
{
    @Test
    void shouldReturnFixedBaseBonus()
    {
        BaseBonus baseBonus = new BaseBonus();

        double calculated = baseBonus.calculateBonus();

        assertThat(calculated).isEqualTo(1000.0);
        assertThat(baseBonus.getBonus()).isEqualTo(1000.0);
    }

}