package DungeonsAndDragons;

public class Weapon {

    private String name;

    public Weapon() {
        this.name ="épée Abéclat";
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
