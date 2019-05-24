package DungeonsAndDragons;

public class Weapon extends Attack{

    /**
     * Constructeur Weapon
     *
     */

    public Weapon() {

        this("épée Abéclat");
    }

   public Weapon(String name){

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
