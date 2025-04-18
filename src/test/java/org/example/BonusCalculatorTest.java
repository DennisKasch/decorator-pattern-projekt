package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class BonusCalculatorTest {


    @Test
    void testValidConstructor()
    {
        Employee employee = mock(Employee.class);
        BonusService bonusService = mock(BonusService.class);

        BonusCalculator bonusCalculator = new BonusCalculator(employee, bonusService);

        assertThat(bonusCalculator.getBonusService()).isEqualTo(bonusService);
        assertThat(bonusCalculator.getEmployee()).isEqualTo(employee);
    }
}