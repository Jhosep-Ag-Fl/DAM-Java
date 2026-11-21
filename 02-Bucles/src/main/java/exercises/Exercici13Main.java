package exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercici13Main {
    static void main() {
        int opcion, lines, sum = 1, num = 1, num6 = 0;
        int ref, power = 3;
        System.out.println("Nombre de línies que vol que tingui el dibuix (enter):");
        Scanner keyboard = new Scanner(System.in);
        lines = keyboard.nextInt();
        System.out.println("Quin dibuix vols? (d'1 al 6): ");
        opcion = keyboard.nextInt();
        switch (opcion){
            case 1:
                for(int i = 0; i < lines; i ++){
                    for(int j = 0; j < lines; j ++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for(int i = 0; i < lines; i ++){
                    for(int j = 0; j <= i; j ++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for(int i = 0; i < lines; i ++){
                    lines -= i;
                    for(int j = 1; j < lines; j ++){
                        System.out.print("  ");
                    }
                    for(int j = 0; j <= i; j ++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    lines += i;
                }
                break;
            case 4:
                for(int i = 0; i < lines; i ++){
                    lines -= i;
                    for(int j = 1; j < lines; j ++){
                        System.out.print(" ");
                    }
                    for(int j = 0; j < sum; j ++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    lines += i;
                    sum += 2;
                }
                break;
            case 5:
                for(int i = 0; i < lines; i ++){
                    lines -= i;

                    num = (int) Math.pow(10, i);
                    for(int j = 1; j < lines; j ++){
                        System.out.print(" ");
                    }
                    for(int j = 0; j < sum; j ++){
                        System.out.print(num);
                    }
                    System.out.println("");
                    lines += i;
                    sum += 2;
                }
                break;
            case 6:
                for(int i = 0; i < lines; i ++){
                    lines -= i;
                    for(int j = 1; j < lines; j ++){
                            System.out.print(" ");
                    }
                    for(int j = 0; j < sum; j ++){
                        num6 += i + 1;
                        if (num6 == 0){
                            num6 = 2;
                            System.out.print(num6);
                            ref = i;
                            while(ref >= 2){
                                System.out.print(power);
                                power ++;
                                ref --;
                            }
                            break;
                        }
                        System.out.print(num6);
                        if(i>=2){
                            num6 -= 3+num;
                        }else {
                            num6 -= 3;
                        }
                    }
                    if(i>=2){
                        num++;
                    }
                    System.out.println("");
                    lines += i;
                    power = 3;
                    sum += 2;
                    num6 = 0;
                }
                break;
            /*case 6:
                for (int i = 1; i <= lines; i++) {

                    for (int j = 1; j <= lines - i; j++) {
                        System.out.print(" ");
                    }

                    for (int j = i; j >= 1; j--) {
                        System.out.print(j);
                    }

                    for (int j = 2; j <= i; j++) {
                        System.out.print(j);
                    }

                    System.out.println();
                }
                break;

             */
            default:
                System.out.println("Valor introduït incorrecte!");
                break;
        }
    }
}
