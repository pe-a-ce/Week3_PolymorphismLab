package footballTeams;

public abstract class FootballTeams {


    private String name;
    private String location;
    private String league;
    private int position;

        public boolean isTraining;


    public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return this.location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getLeague() {
            return this.league;
        }

        public void setLeague(String league) {
            this.league = league;
        }

        public int getPosition() {
            return this.position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public FootballTeams(String name, String location, String league, int position){
        this.name = name;
        this.location = location;
        this.league = league;
        this.position = position;
    }

    public boolean isTraining(){
            this.isTraining = true;
            return true;
    }

    public boolean isNotTraining(){
            this.isTraining = false;
            return false;
    }

    public String shoutChant(){
            return "YAY!";
    }







}
