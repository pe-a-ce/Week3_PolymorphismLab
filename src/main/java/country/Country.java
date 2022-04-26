package country;

import league.Champions;
import league.Premier;
import staff.Linesman;
import staff.MatchRef;
import staff.SubsRef;

public class Country {

    private String name;
    private Premier premier;
    private Champions champions;

    private SubsRef subsRef;

    private Linesman linesman;


    public Country(String name, Premier premier, Champions champions, SubsRef subsRef, Linesman linesman) {
        this.name = name;
        this.premier = premier;
        this.champions = champions;
        this.subsRef = subsRef;
        this.linesman = linesman;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Premier getPremier() {
        return this.premier;
    }

    public void setPremier(Premier premier) {
        this.premier = premier;
    }

    public Champions getChampions() {
        return this.champions;
    }

    public void setChampions(Champions champions) {
        this.champions = champions;
    }

    public SubsRef getSubsRef() {
        return this.subsRef;
    }

    public void setSubsRef(SubsRef subsRef) {
        this.subsRef = subsRef;
    }

    public Linesman getLinesman() {
        return this.linesman;
    }

    public void setLinesman(Linesman linesman) {
        this.linesman = linesman;
    }

    public void makeSub(){
        this.subsRef.makeSub();
    }

    public void reportFouls(){
        this.linesman.reportFouls();
    }
}
