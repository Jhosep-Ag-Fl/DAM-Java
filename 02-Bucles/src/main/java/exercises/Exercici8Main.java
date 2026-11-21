package exercises;

import java.util.Scanner;

public class Exercici8Main {
    //Problema: no té en compte els zeros
    static void main() {
        int num, digit, invertit = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdueix un número enter més gran a 0:");
        num = keyboard.nextInt();
        if (num <= 0) {
            System.out.println("Error");
        } else {
                while (num > 0) {
                    digit = num % 10;
                    invertit = invertit*10 + digit;
                    num /= 10;
                }
                System.out.println(invertit);
        }
    }
}