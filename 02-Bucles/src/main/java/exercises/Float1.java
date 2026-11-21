package exercises;

import java.util.Scanner;

public class Float1 {
    static void main() {
        float preu, preu_nou, diners, resultat;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdueix el preu del producte:");
        preu = keyboard.nextFloat();
        preu_nou = preu*1.21f;
        System.out.println("El preu total del producte amb IVA és "+ preu_nou);
        System.out.println("Quants diners tens per pagar-ho?");
        diners = keyboard.nextFloat();

        resultat = Float.compare(preu_nou, diners);
        if(resultat == 0){
            System.out.println("Queda pagat!");
        }else if(resultat < 0){
            resultat=diners - preu_nou;
            System.out.printf("Canvi %.2f\n", resultat);
        }else{
            resultat=preu_nou - diners;
            System.out.printf("Et falta %.2f\n", resultat);
        }
    }
}
