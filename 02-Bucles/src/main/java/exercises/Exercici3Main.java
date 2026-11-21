package exercises;

import java.util.Scanner;

public class Exercici3Main {
    static void main() {
        int num, sum = 0;
        boolean isPositive = false;
        Scanner keyboard = new Scanner(System.in);
        while(!isPositive){
            System.out.println("Introdueix un valor: ");
            num = keyboard.nextInt();
            if(num < 0){
                isPositive = true;
            }else{
                sum += num;
            }
        }
        System.out.println("El resultat final de la suma de tots els valors positius introduïts és "+ sum);
        keyboard.close();//Com se faria amb un for?
        //Sé que seria amb un break, però que aniria als paràmetres del for?
    }
}
