import footballTeams.Arsenal;
import footballTeams.Chelsea;
import league.League;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeagueTest {
    League league;
    @BeforeEach
    void addTeams() {


        league = new League("Premier");
        Chelsea chelsea = new Chelsea("Blues", "UK", "Premier", 1);
        Arsenal arsenal = new Arsenal("Gunners", "UK", "Premier", 2);
        league.addFootballTeams(chelsea);
        league.addFootballTeams(arsenal);
    }

    @Test
    void addDifferentTeamsToLeagueTest(){
            assertEquals(2, league.countTeams());
    }
}
