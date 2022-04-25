package league;

import footballTeams.FootballTeams;

public class LondonTeams extends League{
    public LondonTeams(String name){
        super(name);
    }

    public void addFootballTeam(FootballTeams footballTeams){
        this.footballTeams.add(footballTeams);
    }
}
