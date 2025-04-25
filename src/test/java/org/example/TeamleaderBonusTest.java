package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TeamleaderBonusTest {
    private TeamleaderBonus teamleaderBonus;

    @Test
    void testValidConstructor() {
        teamleaderBonus = new TeamleaderBonus(100, true);

        assertThat(teamleaderBonus.getBonus()).isEqualTo(100);
        assertThat(teamleaderBonus.isTeamLeader()).isEqualTo(true);
    }

    @Test
    void testCalculateBonus_isTeamleader() {
        teamleaderBonus = new TeamleaderBonus(100, true);
        int expectedBonus = 100;
        assertThat(teamleaderBonus.calculateBonus()).isEqualTo(expectedBonus);
    }
}