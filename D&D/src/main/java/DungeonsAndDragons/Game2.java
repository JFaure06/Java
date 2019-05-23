package DungeonsAndDragons;

import java.util.Scanner;

/**
 * Programme du jeu Dungeon & Dragon
 *
 * @author julien F.
 * @version beta 0.1
 */

public class Game2 {

    public static void main(String[] args) {
        Warrior warrior = null;
        Magician magician = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to D&D");

        Personnage[] listPersonnages = new Personnage[20];
        int index = 0;


        while (true) {

            //ArrayList<Personnage> personnages = new ArrayList<>();
            //personnages.add(warrior);
            //personnages.add(magician);

            // Affiche menu
            System.out.println("Menu");
            System.out.println("1 : création de personnages");
            System.out.println("2 : Liste des personnages existant");
            System.out.println("3 : Personnage");
            System.out.println("votre choix");
            int menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:

                    System.out.println("voulais vous créer un personnage ? (oui ou non)");
                    String reponse = sc.next();

                    if (reponse.equals("oui")) {

                        System.out.println("Entrer le nom du personnage :");
                        String name = sc.next();

                        System.out.println("Veuillez choisir un personnage 1 pour Guerrier, 2 pour Magicien"); // Je demande au joueur de sélectionner son personnage

                        int choice = sc.nextInt();// je met son choix dans une variable

                        // je fais une condition

                        if (choice == 1) { // si le joueur choisis 1 alors il créais un Gurerrier

                            int lifeLevel = (int) (Math.random() * (10 - 5) + 1);
                                                                                    // pour Guerrier la vie et force sont générées aléatoirement avec un nombre maximum et minimum
                            int forceLevel = (int) (Math.random() * (10 - 5) + 1);

                            Weapon weapon = new Weapon(); // je créais une variable
                            Shield shield = new Shield();

                            warrior = new Warrior(name, lifeLevel, forceLevel, weapon, shield);

                            System.out.println("personnage créé :");
                            listPersonnages[index] = warrior;
                            System.out.println(listPersonnages[index].toString());
                            index++;

                            //personnages.add(warrior);

                        } else if (choice == 2) {

                            int lifeLevel = (int) (Math.random() * (6 - 3) + 1); // déclare un variable qui est instancier d'un nombre aléatoire avec un max et minimum
                            int forceLevel = (int) (Math.random() * (10 - 5) + 1);

                            Spell spell = new Spell();
                            Invocation invocation = new Invocation();

                            magician = new Magician(name, lifeLevel, forceLevel, spell, invocation); // mon onbjet est instacier en récupérant les infos

                            listPersonnages[index] = magician;
                            System.out.println(listPersonnages[index].toString());
                            index++;

                            //personnages.add(magician);

                        } else {

                            System.out.println("erreur de saisi");
                        }
                    }
                    break;

                case 2:

                    for (int i = 0; i < listPersonnages.length; i++) {
                        if (listPersonnages[i] != null) {
                            System.out.println(i + " : " + listPersonnages[i].getClass().getSimpleName() + " | Nom : " + listPersonnages[i].getName() + " | Vie : " + listPersonnages[i].getLifeLevel() + " | Force : " + listPersonnages[i].getForceLevel());
                        }
                    }
                    break;

                case 3:

                    for (int i = 0; i < listPersonnages.length; i++) {
                        if (listPersonnages[i] != null) {
                            System.out.println(i + " :" + listPersonnages[i].getClass().getSimpleName());
                        }
                    }

                    System.out.println();
                    System.out.println("1 : informations personnage, 2 : Suppression personnage, 3 : Modification personnage");
                    System.out.println("votre choix:");

                    int submenu = sc.nextInt();

                    switch (submenu) {

                        case 1: // affiche information personnage

                            System.out.println("entre le numero du personnage");
                            int select = sc.nextInt();
                            System.out.println(listPersonnages[select]);
                            break;

                        case 2: // supprime personnage

                            System.out.println("entre le numero du personnage à supprimer");
                            int idslect = sc.nextInt();
                            listPersonnages[idslect] = null;
                            break;

                        case 3: //modifie ces infos


                            System.out.println("entre le numéro du personnage a modifier");
                            int pSelect = sc.nextInt();
                            System.out.println("change le nom : ");
                            String newName = sc.nextLine();
                            listPersonnages[pSelect].setName(newName);


                            break;
                    }
            }
        }
    }
}
