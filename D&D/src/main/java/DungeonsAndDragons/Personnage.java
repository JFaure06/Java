package DungeonsAndDragons;

/**
 * <b>Personnage est la classe mère représentant diverses class </b>
 *
 * <p>Personnage est caractérisé pas les information suivante :
 * <ul>
 * <li>Un nom, suceptible d'être changé.</li>
 * <li>Une image, suceptible d'être changé.</li>
 * <li>Un Vie, suceptible d'être changé.</li>
 * <li>Une force suceptible d'être changé.</li>
 * </ul>
 * </p>
 */

public class Personnage {

    private String name;
    private int lifeLevel;
    private int forceLevel;
    private String img;
    private int maxLife;
    private int minLife;
    private int maxForce;
    private int minForce;
    private Attack attack;
    private Defense defense;

    /**
     * Constructeur Personnage avec en paramètre :
     *
     * @param name
     * @param lifeLevel
     * @param forceLevel
     */
    public Personnage(String name, int minLife, int maxLife, int minForce, int maxForce) {
        this.lifeLevel = (int) (Math.random() * (maxLife - minLife) + 1);
        this.forceLevel = (int) (Math.random() * (maxForce - minForce) + 1);

        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // je recupere et retourne mon attribut
    public int getLifeLevel() {
        return lifeLevel;
    }

    // je modifie la vie
    public void setLifeLevel(int lifeLevel) {

        this.lifeLevel = lifeLevel;
    }

    public int getForceLevel() {
        return forceLevel;
    }

    public void setForceLevel(int forceLevel) {
        this.forceLevel = forceLevel;
    }

    public Attack getAttack() {
        return this.attack;
    }

    public void setAttack(final Attack attack) {
        this.attack = attack;
    }

    public Defense getDefense() {
        return this.defense;
    }

    public void setDefense(final Defense defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return " Nom : " + name + ", img : " + img + ", Vie : " + getLifeLevel() + ", Force : " + getForceLevel() + ", " + getAttack() + getDefense() + ".";
    }
}



