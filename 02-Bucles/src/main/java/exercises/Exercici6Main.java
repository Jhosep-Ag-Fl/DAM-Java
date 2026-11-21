package exercises;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Exercici6Main {
    static void main() {
        int num1, num2, sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdueix dos nombres enters (poden ser positius o negatius!):");
        System.out.print("Introdueix el primer enter: ");
        num1 = keyboard.nextInt();
        int abs1 = abs(num1);
        /* Podries fer-lo amb un if:
        if(num1 < 0){
         num1 = -num1; //o num1 = -1*num1;
        }
         */
        System.out.print("Introdueix el segon enter: ");
        num2 = keyboard.nextInt();
        /* Podries fer-lo amb un if:
        if(num2 < 0){
         num2 = -num2; //o num2 = -1*num2;
        }
         */
        int abs2 = abs(num2);
        for(int counter = 0; counter < abs2; counter ++){
            sum += abs1;
        }
        System.out.println("El resultat és: " + sum);
        keyboard.close();
    }
}
