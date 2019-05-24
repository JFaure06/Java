package DungeonsAndDragons;

public class Spell extends Attack {

    /**
     * Constructeur Spell
     */
    public Spell() {

        this("arcane waves");
    }

    public Spell (String name){

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
        return getClass().getSimpleName() + " : " + getName() + ", ";
    }
}
