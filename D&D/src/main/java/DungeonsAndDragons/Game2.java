package DungeonsAndDragons;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

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

        ArrayList<Personnage> personnages = new ArrayList<>();

        while (true) {
            {

                // Affiche menu
                System.out.println("Menu");
                System.out.println("1 : création de personnages");
                System.out.println("2 : Liste des personnages existant");
                System.out.println("3 : Personnage");
                System.out.println("votre choix");
                int menuChoice = 0;

                try {

                    menuChoice = sc.nextInt();
                    sc.nextLine();
                }catch (InputMismatchException a){
                    System.out.println("erreur ce n'est pas un nombre");
                }

                switch (menuChoice) {

                    case 1:

                        System.out.println("voulais vous créer un personnage ? (oui ou non)");
                        String reponse = sc.next();

                        if (reponse.equals("oui")) {

                            System.out.println("Entrer le nom du personnage :");
                            String name = sc.next();

                            System.out.println("Veuillez choisir un personnage 1 pour Guerrier, 2 pour Magicien"); // Je demande au joueur de sélectionner son personnage

                            int choice = sc.nextInt();// je met son choix dans une variable
                            sc.nextLine();

                            // je fais une condition

                            Personnage p = null;
                            Attack a = null;
                            Defense d = null;

                            if (choice == 1) { // si le joueur choisis 1 alors il créais un Gurerrier

                                a = new Weapon(); // je créais une variable
                                d = new Shield();

                                p = new Warrior(name);

                            } else if (choice == 2) {

                                a = new Spell();
                                d = new Invocation();

                                p = new Magician(name); // mon onbjet est instacier en récupérant les infos

                            } else {
                                System.out.println("erreur de saisi");
                            }

                            personnages.add(p);

                            p.setAttack(a);
                            p.setDefense(d);

                            System.out.println("personnage créé :" + p);
                            listPersonnages[index] = p;
                            index++;



                        }
                        break;

                    case 2:

                        for (int i = 0; i < listPersonnages.length; i++) {
                            if (listPersonnages[i] != null) {
                                System.out.println(i + " : " + listPersonnages[i].getClass().getSimpleName() + " | Nom : " + listPersonnages[i].getName() + " | Vie : " + listPersonnages[i].getLifeLevel() + " | Force : " + listPersonnages[i].getForceLevel() + " | " + listPersonnages[i].getAttack() + " | " + listPersonnages[i].getDefense() );
                            }
                        }

                        for (int j = 0; j < personnages.size(); j++){

                        System.out.println(j + " : " + personnages.get(j).getClass().getSimpleName());
                            System.out.println((j + " : " + personnages.get(j)));
                    }
                        break;

                    case 3:

                        for (int i = 0; i < listPersonnages.length; i++) {
                            if (listPersonnages[i] != null) {
                                System.out.println(i + " :" + listPersonnages[i].getClass().getSimpleName());
                            }
                        }

                        for (int j = 0; j < personnages.size(); j++){

                            System.out.println(j + " : " + personnages.get(j).getClass().getSimpleName() +  " | Nom : " + personnages.get(j).getName() + " | Vie : " + personnages.get(j).getLifeLevel() + " | Force : " + personnages.get(j).getForceLevel());
                        }

                        System.out.println();
                        System.out.println("1 : informations personnage, 2 : Suppression personnage, 3 : Modification personnage");
                        System.out.println("votre choix:");

                        int submenu = sc.nextInt();
                        sc.nextLine();

                        switch (submenu) {

                            case 1: // affiche information personnage

                                System.out.println("entre le numero du personnage");
                                int select = sc.nextInt();
                                sc.nextLine();
                                System.out.println(listPersonnages[select]);
                                System.out.println(personnages.get(select));
                                break;

                            case 2: // supprime personnage

                                System.out.println("entre le numero du personnage à supprimer");
                                int idslect = sc.nextInt();
                                sc.nextLine();
                                listPersonnages[idslect] = null;

                                personnages.remove(idslect);
                                break;

                            case 3: //modifie ces infos

                                System.out.println("entre le numéro du personnage a modifier");
                                int pSelect = sc.nextInt();
                                sc.nextLine();
                                System.out.println("change le nom : ");
                                String newName = sc.nextLine();
                                listPersonnages[pSelect].setName(newName);
                                break;
                        }
                }
            }
        }
    }
}

