package DungeonsAndDragons;


// déclaration de l'objet Magicien qui un enfant de personnage
public class Magician extends Personnage {

    // déclaration ces Attributs
    private String classname;
    private String picture;
    private Spell spell;
    private Invocation invocation;

    // déclaration d'une méthode vide
    public Magician(String name, int lifeLevel, int forceLevel) {
        super();
    }

    // déclaration d'une méthode comportant un parametre
    public Magician(String name) {

        // super appel la class mère
        super(name);
    }

    // Constructeur d'initialisation dé Magicien avec des param
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
