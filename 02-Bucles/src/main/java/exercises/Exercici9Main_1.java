package exercises;

import java.util.Scanner;

public class Exercici9Main_1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int positius = 0;
        int negatius = 0;
        int zeros = 0;
        String resposta;
        do {
            System.out.print("Introdueix un nombre enter: ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                positius++;
            } else if (numero < 0) {
                negatius++;
            } else {
                zeros++;
            }
            do {
                System.out.print("Vols introduir un altre nombre? (s/n): ");
                resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("s")
                        && !resposta.equalsIgnoreCase("n")) {
                    System.out.println("Error: respon amb s o n.");
                }
            } while (!resposta.equalsIgnoreCase("s")
                    && !resposta.equalsIgnoreCase("n"));
        } while (resposta.equalsIgnoreCase("s"));
        System.out.println("Nombres positius: " + positius);
        System.out.println("Nombres negatius: " + negatius);
        System.out.println("Zeros: " + zeros);

        scanner.close();
    }
}
