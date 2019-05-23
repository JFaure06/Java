/*package DungeonsAndDragons;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Warrior warrior;
        Magician magician;

        Scanner sc = new Scanner(System.in);

        Personnage[] listPersonnages = new Personnage[10];
        int index = 0;

        while (true) {

            // Je demande au joueur de sélectionner son personnage
            System.out.println("Veuillez choisir un personnage 1 pour Guerrier, 2 pour Magicien, 3 pour afficher la liste perso créé :");
            // je met son choix dand une variable
            int choice = sc.nextInt();

            // je fais une condition

            // si le joueur choisis 1 alors il créais un Gurerrier
            if (choice == 1) {

                // la personne rentre le nom de son personnage
                System.out.println("Veuillez choisir un nom :");
                String name = sc.next();

                int lifeLevel = (int) (Math.random() * (10 - 5) +1);

                int forceLevel = (int) (Math.random() * (10 - 5) +1);
                // la personne choisis son arme
                //System.out.println("Veuillez choisir l'arme :");
                //String arm = sc.nextLine();

                // je créais une variable
                Weapon weapon = new Weapon();
                Shield shield = new Shield();

                warrior = new Warrior(name, lifeLevel, forceLevel, weapon, shield);

                System.out.println(warrior.toString());

                listPersonnages[index] = warrior;
                System.out.println(listPersonnages[index]);
                index++;

                // si non si il choisis 2 il créait un Magicien
            } else if (choice == 2) {

                System.out.println("Veuillez choisir un nom :");
                String name = sc.next();

                // déclare un variable qui est instancier d'un nombre aléatoire avec un max et minimum
                int lifeLevel = (int) (Math.random() * (6 - 3) +1);

                int forceLevel = (int) (Math.random() * (10 - 5) +1);

                // déclaration d'une variable vide
                Spell spell = new Spell();
                Invocation invocation = new Invocation();

                //
                magician = new Magician(name, lifeLevel, forceLevel, spell, invocation);

                System.out.println(magician.toString());

                listPersonnages[index] = magician;
                System.out.println(listPersonnages[index]);
                index++;


            } else if (choice == 3){

                //System.out.println(Arrays.toString(listPersonnages));
                System.out.println(Arrays.toString(listPersonnages));

            } else {

                System.out.println("erreur de saisi");
            }



        }

    }

}
*/
