package DungeonsAndDragons;

public class Shield {

    private String name;

    /**
     * Constructeur Shield
     *
     * @see Shield#name
     */

    public Shield() {
        name = "Eberli Charo";
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
