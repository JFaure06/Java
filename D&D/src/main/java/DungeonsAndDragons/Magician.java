package DungeonsAndDragons;

/**
 * <b>Magician est la classe fille de Personnage du jeu</b>
 *  * <p>
 *  * Un Magician est caractérisé par les informations suivantes :
 *  * <ul>
 *  *     <li>Un nom, suceptible d'être changé.</li>
 *  *     <li>Une image, suceptible d'être changé.</li>
 *  *     <li>Un Vie, suceptible d'être changé.</li>
 *  *     <li>Une force suceptible d'être changé.</li>
 *  *     <li>Une arme, suceptible d'être changé.</li>
 *  *     <li>Un bouclier, suceptible d'être changé.</li>
 *  * </ul>
 *  * </p>
 */

public class Magician extends Personnage {

    private Spell spell;
    private Invocation invocation;

    /**
     * Constructeur Magician sans paramètre
     */

    public Magician() {
        super();
    }

    /**
     * Constructeur Magician avec en paramètre :
     *
     * @param name
     */

    public Magician(String name) {

        super(name);
    }

    /**
     * Constructeur Magician avec en paramètre :
     * @param name
     * @param lifeLevel
     * @param forceLevel
     * @param spell
     * @param invocation
     *
     * @see Magician#spell
     * @see Magician#invocation
     */

    public Magician(String name, int lifeLevel, int forceLevel, Spell spell, Invocation invocation) {
        super(name, lifeLevel, forceLevel);
        this.spell = spell;
        this.invocation = invocation;
    }

    /**
     * Constructeur Magician avec en paramètre :
     * @param name
     * @param lifeLevel
     * @param forceLevel
     * @param img
     * @param spell
     * @param invocation
     *
     * @see Magician#spell
     * @see Magician#invocation
     */

    public Magician(String name, int lifeLevel, int forceLevel, String img, Spell spell, Invocation invocation) {
        super(name, lifeLevel, forceLevel, img);
        this.spell = spell;
        this.invocation = invocation;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Invocation getInvocation() {
        return invocation;
    }

    public void setInvocation(Invocation invocation) {
        this.invocation = invocation;
    }

    public String toString() {
        return "Personnage de Classe : " + this.getClass().getSimpleName() + super.toString() +", sort principal : " + spell + ", sort de défense : " + invocation + "." ;
    }
}