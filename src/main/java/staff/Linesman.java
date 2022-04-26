package staff;

public class Linesman extends Staff implements Reporting{

    public Linesman(String name){
        super(name);
    }

    public String reportFouls(){
        return "That's a foul!";
    }
}
