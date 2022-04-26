package footballTeams;

public class Chelsea extends LondonTeams {

    public Chelsea (String name, String location, String league, int position){
        super(name, location, league, position);
    }

    public String shoutChant(){

        return "Go Team!";
    }

    public String shoutChant(String phrase){
        return "Let's Go " + phrase;
    }

}
