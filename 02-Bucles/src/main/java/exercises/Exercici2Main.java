package exercises;

import java.util.Scanner;

public class Exercici2Main {
    static void main() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Quants nombres parells vols mostrar? ");
        num = keyboard.nextInt();
        if(num<0){
            System.out.println("Error: la quantitat no pot ser negativa.");
        }else{
            for(int counter = 0; counter < num; counter++) {
            System.out.println((counter+1) * 2);
            }
        }
        keyboard.close();
    }
}
