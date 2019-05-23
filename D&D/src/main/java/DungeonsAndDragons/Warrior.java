package DungeonsAndDragons;

/**
 * <b>Warrior est la classe fille de Personnage du jeu</b>
 * <p>
 * Un Warrior est caractérisé par les informations suivantes :
 * <ul>
 *     <li>Un nom, suceptible d'être changé.</li>
 *     <li>Une image, suceptible d'être changé.</li>
 *     <li>Un Vie, suceptible d'être changé.</li>
 *     <li>Une force suceptible d'être changé.</li>
 *     <li>Une arme, suceptible d'être changé.</li>
 *     <li>Un bouclier, suceptible d'être changé.</li>
 * </ul>
 * </p>
 */


// déclaration de l'objet Guerrier qui est lui aussi est un enfant de personnage
public class Warrior extends Personnage {

    // déclaration des Attributs
    private Weapon weapon;
    private Shield shield;

    /**
     * Constructeur Warrior sans paramètre
     */

    // création de différents constructeur
    public Warrior() { // Constructeur d'initialisation du Guerrier vide
    super();
    }

    /**
     * Constructeur Warrior avec en paramètre :
     *
     * @param name
     */

    public Warrior(String name) { // Constructeur d'initialisation du Guerrier avec un param
        super(name);
    }

    /**
     * Constructeur Warrior avec en paramètre :
     *
     * @param name
     * Le nom du Warrior
     * @param lifeLevel
     * Le niveau de vie de Warrior
     * @param forceLevel
     * Le niveau de force de Warrior
     * @param weapon
     * Le nom de l'arme de Warrior
     * @param shield
     * Le nom du bouclier de Warrior
     *
     * @see Warrior#weapon
     * @see Warrior#shield
     */

    public Warrior(String name, int lifeLevel, int forceLevel, Weapon weapon, Shield shield) {
        super(name, lifeLevel, forceLevel);
        this.weapon = weapon;
        this.shield = shield;
    }

    /**
     * Constructeur Warrior
     *
     * @param name
     *              Le nom du Warrior
     * @param lifeLevel
     *              Le niveau de vie de Warrior
     * @param forceLevel
     *              Le niveau de force de Warrior
     * @param weapon
     *              Le nom de l'arme de Warrior
     * @param shield
     *              Le nom du bouclier de Warrior
     *
     * @see Warrior#weapon
     * @see Warrior#shield
     */

    // Constructeur d'initialisation du Guerrier avec plusieurs param
    public Warrior(String name, int lifeLevel, int forceLevel, String img, Weapon weapon, Shield shield) {
        super(name, lifeLevel, forceLevel, img);
        this.weapon = weapon;
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public String toString() {
        return "Personnage de Classe : " + this.getClass().getSimpleName() + super.toString() + ", arme principal : " + weapon + ", bouclier : " + shield + "."  ;
    }
}
