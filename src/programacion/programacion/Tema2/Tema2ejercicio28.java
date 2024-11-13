package Tema2;
import java.util.Scanner;
import java.util.Random;

public class Tema2ejercicio28 {
        public static void main(String[] args) {
                Random random = new Random();
                int ganador = random.nextInt(100000);
                Scanner scanner = new Scanner(System.in);

                System.out.println("Tienes  5 intentos para adivinar el numero.");

                int numero = 0;
                int intento;

                for (intento = 1; intento <= 5; intento++) {
                    System.out.print("Intento" + intento+ ":" );
                    numero = scanner.nextInt();

                    if (numero < 0 || numero > 99999) {
                        System.out.println("no valido");
                        intento--;
                        continue;
                    }

                    if (numero == ganador) {
                        System.out.println("has ganado .");
                        break;
                    } else {
                        System.out.println(" no has ganado,tienes mas intentos");
                    }
                }

                if (numero != ganador) {
                    System.out.println("numero ganador:" + ganador);
                }

                scanner.close();
            }
        }