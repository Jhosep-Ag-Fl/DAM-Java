package exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercici5Main {
    //Fer-lo amb un boolean i un while
    static void main() {
        int num, valor;
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random(100);
        //Encara no entenc que significa el número del seed
        //però, sé que no deixa que evalor = rnd.nextInt(0, 10);l número varie, es queda amb aquell.
        //L'enuciat no especifica l'interval del nombre aleatori
        valor = rnd.nextInt(10);
        System.out.println("Endevina el nombre entre 1 i 100.");
        System.out.println("Tens un màxim de 20 intents.");
        for(int i = 0; i < 20; i++){
            num = keyboard.nextInt();
            if(num != valor){
                if(i == 19){
                    System.out.println("Intents esgotats, el nombre que calia encertar era el " + valor);
                }
                continue;
            }
            System.out.println("Has guanyat el joc!");
            i = 19;//break amagat
        }
        keyboard.close();
    }
}