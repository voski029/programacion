package Tema2;
import java.util.Scanner;

public class Tema2ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        int numero1 = input.nextInt();
        System.out.println("Escribe el segundo número:");
        int numero2 = input.nextInt();
        System.out.println("Escribe el tercer número:");
        int numero3 = input.nextInt();


        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("El mayor es: " + numero3);
        }

        input.close();
    }
}