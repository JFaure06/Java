package DungeonsAndDragons;

public class Invocation {

    private String name;

    public Invocation() {
        name = "ice shield";
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
