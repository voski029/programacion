package Tema1;

import java.util.Scanner;

public class Tema1ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingress una cara del dado (1-6): ");
        int cara = scanner.nextInt();


        if (cara < 1 || cara > 6) {
            System.out.println("No es correcto,vuelva a poner el numero.");

        }

        int caraopuesta = 7 - cara;
        System.out.println("La cara opuesta del dado es: " + caraopuesta);
    }

}
