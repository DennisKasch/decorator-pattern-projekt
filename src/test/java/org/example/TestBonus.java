package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestBonus {

    private Bonus bonus;
    @BeforeEach
    void setUp()
    {
        //Spy does not allow abstract classes with Parameterized Constructor.
        //This Mock will still use implemented methods with its real answers.
        bonus = mock(Bonus.class,
                Mockito.withSettings().useConstructor(10.).defaultAnswer(CALLS_REAL_METHODS));
    }

    @Test
    void testValidConstructor()
    {
        assertThat(bonus.getBonus()).isEqualTo(10.);
    }
}
