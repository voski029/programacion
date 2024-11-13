package Tema2;

import java.util.Scanner;

public class Tema2ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeropar = input.nextInt();
        do {
            System.out.println("Escribe un numero entre 1 y 1000");
            if (numeropar < 1 || numeropar > 1000) {
                System.out.println("Numero no valido,");
            }
        } while (numeropar < 1 || numeropar > 1000);

        if (numeropar % 2 == 0) {
            System.out.println("El numero" + numeropar + "es par");
            input.close();
        }
    }
}