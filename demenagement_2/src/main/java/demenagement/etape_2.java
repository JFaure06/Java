// importation du package
package demenagement;

// déclaration de la class
public class etape_2 {

    // modification de la syntaxe
    // ancienne syntaxe void setup()
    public static void main(String[] args) {
        int nbCar = 250;
        int capaCam1 = 5;
        int capaCam2 = 7;
        int capaCam3 = 9;
        int nbMove = 0;
        int a = 0;
        int c = 0;

        while (nbCar > 0) {
            a = nbCar;
            {
                nbCar = movCar(nbCar, capaCam1);
            }
            if (nbCar > 0) {
                nbCar = movCar(nbCar, capaCam2);
            }
            if (nbCar > 0) {
                nbCar = movCar(nbCar, capaCam3);
            }
            c = nbCar;

            // syntaxe println changée en System.out.println
            System.out.println("voyage " + nbMove + " de " + (a - c) + " cartons");
            nbMove++;
        }

        // syntaxe print changée en System.out.print
        System.out.print("nombre de voyage " + nbMove);
    }

    // modification de la syntaxe
    // anciennement int movCar
    public static int movCar(int nbCar, int capaCam) {
        if (nbCar >= capaCam) {
            return nbCar - capaCam;
        } else {
            return nbCar - nbCar;
        }
    }

}
