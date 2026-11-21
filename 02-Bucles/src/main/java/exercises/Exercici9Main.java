package exercises;

import java.util.Scanner;

public class Exercici9Main {
    static void main() {
        int num, counter_nev = 0, counter_pos = 0, counter_zeros = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean isPrime = true;
        while(isPrime){
            System.out.println("Introdueix un número:");
            num = keyboard.nextInt();
            if(num < 0){
                counter_nev ++;
            }else if(num > 0){
                counter_pos ++;
            }else{
                counter_zeros ++;
            }
            System.out.println("Vols continuar? (true/false): ");
            isPrime = keyboard.nextBoolean();
        }
        System.out.println("La quantitat de nombres negatius introduïts és "+ counter_nev);
        System.out.println("La quantitat de nombres positius introduïts és "+ counter_pos);
        System.out.println("La quantitat de nombres zeros introduïts és "+ counter_zeros);
        keyboard.close();
    }
}
