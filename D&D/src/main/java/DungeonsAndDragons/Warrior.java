package DungeonsAndDragons;

import javax.naming.Name;

// déclaration de l'objet Guerrier qui est lui aussi un enfant de personnage
public class Warrior extends Personnage {

    private String classname;
    private String avatar;
    private Weapon weapon;
    private Shield shield;


    public Warrior(String name, int lifeLevel, int forceLevel) {
    super();

    }

    public Warrior(String name) {

        super(name);
    }

    public Warrior(String name, int lifeLevel, int forceLevel, Weapon weapon) {
        super(name, lifeLevel, forceLevel);
        this.classname = "Guerrier";
        this.avatar = "../Warrior.jpg";
        this.weapon = weapon;

    }

    public Warrior(String name, int lifeLevel, int forceLevel, Weapon weapon, Shield shield) {
        super(name, lifeLevel, forceLevel);
        this.classname = "Guerrier";
        this.avatar = "../Warrior.jpg";
        this.weapon = weapon;
        this.shield = shield;

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
        return "je suis un : " + classname + " " + avatar + " " + "je m'appel : " + name + "mon arme principal est : " + weapon + "mon bouclier est : " + shield + ".";
    }

}
