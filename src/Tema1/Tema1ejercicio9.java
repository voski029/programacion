package Tema1;

import java.util.Scanner;

public class Tema1ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;
        int division = numero1%numero2;
        int resto = 0;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        if (numero2 != 0) {
            System.out.println("División: " + division);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        scanner.close();
    }
}
