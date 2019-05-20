package DungeonsAndDragons;

import javax.naming.Name;

// déclaration de l'objet Guerrier qui est lui aussi est un enfant de personnage
public class Warrior extends Personnage {

    // déclaration des Attributs
    private String classname;
    private String avatar;
    private Weapon weapon;
    private Shield shield;

    // création de différents constructeur

    // // Constructeur d'initialisation du Guerrier vide
    public Warrior() {
    super();

    }

    // Constructeur d'initialisation du Guerrier avec un param
    public Warrior(String name) {

        super(name);
    }

    // Constructeur d'initialisation du Guerrier avec plusieurs param
    public Warrior(String name, int lifeLevel, int forceLevel, Weapon weapon, Shield shield) {
        super(name, lifeLevel, forceLevel);
        this.classname = "Guerrier";
        this.avatar = "../Warrior.jpg";
        this.weapon = weapon;
        this.shield = shield;

    }

    @Override
    // methode qui permet de récuperer la valeur de vie
    public int getLifeLevel() {
        return super.getLifeLevel();
    }

    @Override

    // méthode qui permet de modifier la valeur de vie
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
        return "Personnage de Classe : " + classname + " " + avatar + " " + ", nom : " + name + ", arme principal : " + weapon + ", bouclier : " + shield + ", Vie : " + getLifeLevel() + ", Force : " + getForceLevel() + "."  ;
    }

}
