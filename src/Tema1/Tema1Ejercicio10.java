package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Introduce el primer número real: ");
        double numero1 = input.nextDouble();
        System.out.print("Introduce el segundo número real: ");
        double numero2 = input.nextDouble();

        double suma = numero1 + numero2;
        double producto = numero1 * numero2;
        double division=numero1%numero2;
        double resto =0;

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);

        if (numero2 != 0) {
            System.out.println("División: " + division);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        input.close();


    }
}