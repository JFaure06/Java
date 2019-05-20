package DungeonsAndDragons;

public class Spell {

    private String name;

    public Spell(){

        this.name = "arcane waves";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
