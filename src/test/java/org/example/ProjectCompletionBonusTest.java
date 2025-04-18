package org.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProjectCompletionBonusTest
{

    private ProjectCompletionBonus projectCompletionBonus;

    @BeforeEach
    void setUp()
    {
        projectCompletionBonus = new ProjectCompletionBonus(100,20);
    }

    @Test
    void testValidConstructor()
    {
        assertThat(projectCompletionBonus.getBonus()).isEqualTo(100);
    }
}