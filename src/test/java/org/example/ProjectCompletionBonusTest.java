package org.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProjectCompletionBonusTest
{
    @Test
    void testValidConstructor()
    {
        double bonusValue = 50;
        int completedProjectsValue = 20;
        ProjectCompletionBonus projectCompletionBonus = new ProjectCompletionBonus(bonusValue, completedProjectsValue);

        assertThat(projectCompletionBonus.getBonus()).isEqualTo(bonusValue);
        assertThat(projectCompletionBonus.getCompletedProjects()).isEqualTo(completedProjectsValue);
    }
}