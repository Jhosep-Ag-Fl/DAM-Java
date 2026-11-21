package exercises;

import java.util.Scanner;

public class Exercici7Main {
    static void main() {
        int num, factorial = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdueix un número enter més gran o igual a 0:");
        num = keyboard.nextInt();
        if(num < 0){
            System.out.println("Error");
        }
        else{
            for(int i = num; 0 < i; i--){
                factorial *= i;
            }
            System.out.println("El factorial de "+ num + " introduït és "+ factorial);
        }
        keyboard.close();
    }
}
