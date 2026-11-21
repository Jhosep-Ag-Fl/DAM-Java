package exercises;

import java.util.Scanner;

public class Exercici10Main {
    static void main() {
        int t, succession = 0, succession1 = 0, num = 1, num1 = 0;
        Scanner keyboard = new Scanner(System.in);
        t = keyboard.nextInt();
        while(t <= 0){
            t = keyboard.nextInt();
        }
        for(int counter = 0; counter < t; counter ++){
            if(counter < 2) {
                System.out.print(succession +" ");
                succession += num;
            }else{
                succession = succession1 + num;
                System.out.print(succession +" ");
                succession1 = num;
                num = succession;
            }
        }
        keyboard.close();
    }
}
