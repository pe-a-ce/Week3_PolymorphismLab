package staff;

public abstract class Staff {

    private String name;

    public Staff (String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
