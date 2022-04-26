package league;

import footballTeams.FootballTeams;

import java.util.ArrayList;

public class League {

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

//    this was not working before because we had not declared a method, so the actual value was 0, because it had nothing to do when it called this method in the test.
    public void addFootballTeams(FootballTeams footballTeams){
//        OUR MISSING METHOD.
//        adding the football teams to the array list
        this.footballTeams.add(footballTeams);
    }
    public int countTeams(){
        return this.footballTeams.size();
    }
}
