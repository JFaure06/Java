package DungeonsAndDragons;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Warrior warrior;
        Magician magician;

        Scanner sc = new Scanner(System.in);


        System.out.println("Veuillez choisir un personnage 1 pour Guerrier, 2 pour Magicien :");

        while (true) {
            // Je demande au joueur de sélectionner son personnage
            System.out.println("Veuillez choisir un personnage 1 pour Guerrier, 2 pour Magicien :");
            // je met son choix dand une variable
            int choice = sc.nextInt();

            // je fais une condition

            // si le joueur choisis 1 alors il créais un Gurerrier
            if (choice == 1) {

                // la personne rentre le nom de son personnage
                System.out.println("Veuillez choisir un nom :");
                String name = sc.next();

                int lifeLevel = (int) (Math.random() * (10 - 5));

                int forceLevel = (int) (Math.random() * (10 - 5));
                // la personne choisis son arme
                //System.out.println("Veuillez choisir l'arme :");
                //String arm = sc.nextLine();

                // je créais une variable
                Weapon weapon = new Weapon();
                Shield shield = new Shield();

                warrior = new Warrior(name, lifeLevel, forceLevel, weapon, shield);

                System.out.println(warrior.toString());

                // si non si il choisis 2 il créait un Magicien
            } else if (choice == 2) {

                System.out.println("Veuillez choisir un nom :");
                String name = sc.next();

                // déclare un variable qui est instancier d'un nombre aléatoire avec un max et minimum
                int lifeLevel = (int) (Math.random() * (6 - 3));

                int forceLevel = (int) (Math.random() * (10 - 5));

                // déclaration d'une variable vide
                Spell spell = new Spell();
                Invocation invocation = new Invocation();

                //
                magician = new Magician(name, lifeLevel, forceLevel, spell, invocation);

                System.out.println(magician.toString());

            } else {

                System.out.println("erreur de saisi");
            }
        }


    }
}

