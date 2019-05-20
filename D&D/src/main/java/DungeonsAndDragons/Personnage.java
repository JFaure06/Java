package DungeonsAndDragons;

public class Personnage {

    public String name;
    private int lifeLevel;
    private int forceLevel;

    public Personnage(){
        lifeLevel=5;
    }

    public Personnage(String name){
        this.name = name;
        lifeLevel=5;
    }

    // constructeur de personnage
    public Personnage(String name, int lifeLevel, int forceLevel){

        this.name = name;
        this.lifeLevel = lifeLevel;
        this.forceLevel = forceLevel;
    }

    // je recupere et retourne mon attribut
    public int getLifeLevel(){
        return lifeLevel;
    }

    // je modifie la vie
    public void setLifeLevel(int lifeLevel){

        this.lifeLevel = lifeLevel;
    }

    public int getForceLevel() {
        return forceLevel;
    }

    public void setForceLevel(int forceLevel) {
        this.forceLevel = forceLevel;
    }
}
