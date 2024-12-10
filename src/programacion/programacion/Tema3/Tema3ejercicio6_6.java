package Tema3;

import java.util.Scanner;

public class Tema3ejercicio6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int numero = input.nextInt();
        int number = Metodos.MyMath.factorial(numero);
        System.out.println("El factorial de " + numero + " es :" + number);

    }
}
