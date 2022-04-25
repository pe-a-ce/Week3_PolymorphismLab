package league;

import footballTeams.FootballTeams;

import java.util.ArrayList;

public abstract class League {

    private String name;
    public ArrayList<FootballTeams>footballTeams;


    public League (String name){
        this.name = name;
        this.footballTeams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FootballTeams> getFootballTeams() {
        return footballTeams;
    }

    public void setFootballTeams(ArrayList<FootballTeams> footballTeams) {
        this.footballTeams = footballTeams;
    }

    public void addFootballTeams(FootballTeams footballTeams){

    }

    public int countTeams(){
        return this.footballTeams.size();
    }
}
