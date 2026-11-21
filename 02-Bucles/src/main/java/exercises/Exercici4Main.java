package exercises;

import java.util.Scanner;

public class Exercici4Main {
    static void main() {
        int num, sum = 0;
        Scanner keyboard = new Scanner(System.in);
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Introdueix el nombre " + counter + ": ");
            num = keyboard.nextInt();
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("La suma dels nombres parells és "+ sum);
        keyboard.close();
    }
}
