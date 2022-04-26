package footballTeams;

public class ManchesterUtd extends ManchesterTeams {

    public ManchesterUtd(String name, String location, String league, int position) {
        super(name, location, league, position);

    }

    public String shoutChant(){
        return "GOAAL!";
    }

    public String shoutChant(String phrase){
        return "" + phrase;
    }
}
