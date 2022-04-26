package staff;

import footballTeams.FootballTeams;

public class MatchRef extends Staff implements Reporting, Whistle{

    public MatchRef(String name){
        super(name);
    }

    public String reportFouls(){
        return "That's a foul!";
    }

    public void blowWhistle(FootballTeams footballTeams){
        footballTeams.shoutChant();
    }
}
