package Tema3Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tema3ArraysEjercicio6 {

    public static void main(String[] args) {

        int tamanio = 20;
        int numMinas = 6;


        char[] tablero = new char[tamanio];
        int[] pistas = new int[tamanio];


        for (int i = 0; i < tamanio; i++) {
            tablero[i] = '0';
            pistas[i] = 0;
        }


        Random rand = new Random();
        for (int i = 0; i < numMinas; i++) {
            int minaPos = rand.nextInt(tamanio);
            while (tablero[minaPos] == '*') {
                minaPos = rand.nextInt(tamanio);
            }
            tablero[minaPos] = '*';
        }


        for (int i = 0; i < tamanio; i++) {
            if (tablero[i] == '*') {

                if (i > 0 && tablero[i - 1] != '*') pistas[i - 1]++;
                if (i < tamanio - 1 && tablero[i + 1] != '*') pistas[i + 1]++;
            }
        }


        Scanner scanner = new Scanner(System.in);
        boolean[] descubierto = new boolean[tamanio];
        int casillasDescubiertas = 0;
        boolean juegoTerminado = false;

        System.out.println("¡Bienvenido al Buscaminas!");
        System.out.println("Hay 6 minas en el tablero. ¿Podrás evitarlas?");
        System.out.println("El tablero tiene 20 casillas numeradas del 1 al 20.");


        while (!juegoTerminado) {

            System.out.print("Estado del tablero: ");
            for (int i = 0; i < tamanio; i++) {
                if (descubierto[i]) {
                    System.out.print(pistas[i] + " ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.print("Selecciona una posición (1-20) para descubrir: ");
            int seleccion = scanner.nextInt() - 1; // empiezas desde esa posicion


            if (seleccion < 0 || seleccion >= tamanio || descubierto[seleccion]) {
                System.out.println("Posicion no valida vuelve a intentarlo ");
                continue;
            }


            if (tablero[seleccion] == '*') {
                System.out.println("Has pisado una mina , has perdido ");
                juegoTerminado = true;
            } else {
                // Mostrar la pista de la casilla seleccionada
                descubierto[seleccion] = true;
                casillasDescubiertas++;
                System.out.println("casilla seleccionada: " + (seleccion + 1) + " -> " + pistas[seleccion]);

                // Verificar si el jugador ha descubierto todas las casillas sin minas
                if (casillasDescubiertas == tamanio - numMinas) {
                    System.out.println("Ganaste no hay mas casillas por descubrir");
                    juegoTerminado = true;
                }
            }


            // Mostrar el tablero final con las minas
            System.out.println("Tablero final:");
            for (int i = 0; i < tamanio; i++) {
                if (tablero[i] == '*') {
                    System.out.print("* ");
                } else {
                    System.out.print(pistas[i] + " ");
                }
            }


        }
        scanner.close();
    }
}