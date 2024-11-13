package Tema2;
import java.util.Scanner;

public class Tema2ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pon un numero para calcular la raiz cuadrada: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Error: No se puede calcular la raiz cuadrada de un numero negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.printf("La raiz cuadrada de:" +numero+ "es:" +raiz);
        }

        input.close();
    }
}


