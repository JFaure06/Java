package DungeonsAndDragons;


// déclaration de l'objet Magicien qui est un enfant de personnage
public class Magician extends Personnage {

    // déclaration des Attributs
    private String classname;
    private String picture;
    private Spell spell;
    private Invocation invocation;

    // Constructeur d'initialisation de Magicien vide
    public Magician() {
        super();
    }

    // Constructeur d'initialisation de Magicien comportant un parametre
    public Magician(String name) {

        // super appel la class mère
        super(name);
    }

    // Constructeur d'initialisation de Magicien avec des param
    public Magician(String name, int lifeLevel, int forceLevel, Spell spell, Invocation invocation) {

        super(name, lifeLevel, forceLevel);
        classname = "Magicien";
        picture = "../Magician.png";
        this.spell = spell;
        this.invocation = invocation;
    }

    @Override
    public int getLifeLevel() {
        return super.getLifeLevel();
    }

    @Override
    public void setLifeLevel(int lifeLevel) {
        super.setLifeLevel(lifeLevel);
    }

    @Override
    public int getForceLevel() {
        return super.getForceLevel();
    }

    @Override
    public void setForceLevel(int forceLevel) {
        super.setForceLevel(forceLevel);
    }

    public String toString() {
        return "je suis un : " + classname + " " + picture + ", je m'appel : " + name + ", mon sort principal est : " + spell + ", mon sort de défense est : " + invocation + ".";
    }
}
