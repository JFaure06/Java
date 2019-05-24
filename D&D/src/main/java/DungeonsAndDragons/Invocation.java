package DungeonsAndDragons;

public class Invocation extends Defense{

    /**
     * Constructeur Invocation
     *
     * @see Invocation
     */

    public Invocation() {
        this("ice shield");
    }

    public Invocation(String name){

        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(final String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getName();
    }
}
