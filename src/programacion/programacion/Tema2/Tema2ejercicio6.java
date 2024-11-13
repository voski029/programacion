package Tema2;
import java.util.Scanner;

public class Tema2ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introducir numero:");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero == 0) {
            System.out.println("El numero es igual a 0");

        input.close();
        }
    }
}


