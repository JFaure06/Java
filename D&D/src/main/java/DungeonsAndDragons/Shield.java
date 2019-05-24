package DungeonsAndDragons;

public class Shield extends Defense{

    /**
     * Constructeur Shield
     *
     */
    public Shield() {
       this("Eberli Charo");
    }

    public Shield (String name){
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
