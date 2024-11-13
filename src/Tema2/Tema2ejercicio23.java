package Tema2;
import java.util.Scanner;

public class Tema2ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int contar = 0;

        System.out.println("Escribe un número:");
        numero = input.nextInt();

        while (numero >= 0) {
            suma += numero;  // o suma = suma+numero
            contar++;
            System.out.println("Escribe otro numero):");
            numero = input.nextInt();
        }


        if (contar > 0) {
            double media = (double) suma / contar;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se han introducido números positivos.");
        }

        input.close();
    }
}
