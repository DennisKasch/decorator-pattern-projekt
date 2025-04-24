package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBonusTest
{
    @Test
    void shouldReturnGivenBaseBonus()
    {
        double expectedBonus = 1000;
        BaseBonus baseBonus = new BaseBonus(expectedBonus);

        double actualBonus = baseBonus.calculateBonus();

        assertThat(actualBonus).isEqualTo(expectedBonus);
    }
}