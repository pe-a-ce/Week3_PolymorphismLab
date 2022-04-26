package staff;

public class SubsRef extends Staff implements Subs{

    public SubsRef(String name){
        super(name);
    }

    public String makeSub(){
        return "Substitution made!";
    }

}
