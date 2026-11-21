package exercises;

import java.util.Scanner;

public class Exercici3Main_1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        long suma = 0;
        int numero;

        do {
            System.out.print("Introdueix un enter (negatiu per acabar): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("La suma dels valors positius és: " + suma);

        scanner.close();
    }
}
