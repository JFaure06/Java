package DungeonsAndDragons;

/**
 * <b>Magician est la classe fille de Personnage du jeu</b>
 * * <p>
 * * Un Magician est caractérisé par les informations suivantes :
 * * <ul>
 * *     <li>Un nom, suceptible d'être changé.</li>
 * *     <li>Une image, suceptible d'être changé.</li>
 * *     <li>Un Vie, suceptible d'être changé.</li>
 * *     <li>Une force suceptible d'être changé.</li>
 * *     <li>Une arme, suceptible d'être changé.</li>
 * *     <li>Un bouclier, suceptible d'être changé.</li>
 * * </ul>
 * * </p>
 */
public class Magician extends Personnage {

    private static final int MIN_LIFE = 5;
    private static final int MAX_LIFE = 10;
    private static final int MIN_FORCE = 5;
    private static final int MAX_FORCE = 10;

    /**
     * Constructeur Magician sans paramètre
     */
    public Magician(String name) {
        super(name, MIN_LIFE, MAX_LIFE, MIN_FORCE, MAX_FORCE);
    }

    /**
     * Constructeur Magician avec en paramètre :
     *
     * @param name
     */
    public Magician() {
        this("");
    }

    public String toString() {
        return "Personnage de Classe : " + this.getClass().getSimpleName() + super.toString() + ".";
    }
}