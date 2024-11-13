package Tema2;
import java.util.Scanner;
import java.util.Random;

public class Tema2ejercicio29 {
    public static void main(String[] args) {
            Random random = new Random();
            int numerorandom = random.nextInt(100) + 1;
            Scanner scanner = new Scanner(System.in);


            System.out.println("adivina el numero entre 1 y 100.");

            int numero;

            do {
                System.out.print("introduce un numero: ");
                numero = scanner.nextInt();

                if (numero < numerorandom) {
                    System.out.println("el numero secreto es mayor.");
                } else if (numero > numerorandom) {
                    System.out.println("el numero secreto es menor.");
                } else {
                    System.out.println("acertaste");
                }
            } while (numero != numerorandom);

            scanner.close();
        }
    }

