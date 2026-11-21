package exercises;

import java.util.Scanner;

public class Exercici3Main_2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        long suma = 0;
        System.out.print("Introdueix un enter (negatiu per acabar): ");
        int numero = scanner.nextInt();
        for (; numero >= 0; ) {
            suma += numero;
            System.out.print("Introdueix un enter (negatiu per acabar): ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma dels valors positius és: " + suma);
        scanner.close();
    }
}
