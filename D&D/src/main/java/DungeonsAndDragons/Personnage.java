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

    /**
     * Constructeur Personnage vide
     */

    public Personnage() {

    }

    /**
     * Constructeur Personnage avec en paramètre :
     *
     * @param name Le nom du personnage
     */

    public Personnage(String name) {
        this.name = name;

        // lifeLevel=5;
    }

    /**
     * Constructeur Personnage avec en paramètre :
     *
     * @param name
     * @param lifeLevel
     * @param forceLevel
     */

    public Personnage(String name, int lifeLevel, int forceLevel) {

        this.name = name;
        this.lifeLevel = lifeLevel;
        this.forceLevel = forceLevel;
    }


    /**
     * constructeur Personnage avec en paramètre :
     *
     * @param name
     * @param lifeLevel
     * @param forceLevel
     * @param img
     */
    public Personnage(String name, int lifeLevel, int forceLevel, String img) {

        this.name = name;
        this.lifeLevel = lifeLevel;
        this.forceLevel = forceLevel;
        this.img = img;
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


    @Override
    public String toString() {
        return " Nom : " + name + ", img : " + img + ", Vie : " + getLifeLevel() + ", Force : " + getForceLevel();
    }
}



