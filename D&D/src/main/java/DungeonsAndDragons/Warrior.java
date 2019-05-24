package DungeonsAndDragons;

/**
 * <b>Warrior est la classe fille de Personnage du jeu</b>
 * <p>
 * Un Warrior est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un nom, suceptible d'être changé.</li>
 * <li>Une image, suceptible d'être changé.</li>
 * <li>Un Vie, suceptible d'être changé.</li>
 * <li>Une force suceptible d'être changé.</li>
 * <li>Une arme, suceptible d'être changé.</li>
 * <li>Un bouclier, suceptible d'être changé.</li>
 * </ul>
 * </p>
 */


// déclaration de l'objet Guerrier qui est lui aussi est un enfant de personnage
public class Warrior extends Personnage {

    private static final int MIN_LIFE = 5;
    private static final int MAX_LIFE = 10;
    private static final int MIN_FORCE = 5;
    private static final int MAX_FORCE = 10;

    /**
     * Constructeur Warrior sans paramètre
     */
    public Warrior() { // Constructeur d'initialisation du Guerrier vide
        this("");
    }

    /**
     * Constructeur Warrior avec en paramètre :
     *
     * @param name
     */
    public Warrior(String name) { // Constructeur d'initialisation du Guerrier avec un param
        super(name, MIN_LIFE, MAX_LIFE, MIN_FORCE, MAX_FORCE);
    }

    public String toString() {
        return "Personnage de Classe : " + this.getClass().getSimpleName() + super.toString() + ".";
    }
}
