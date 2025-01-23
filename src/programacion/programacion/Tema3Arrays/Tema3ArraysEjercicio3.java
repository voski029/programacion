package Tema3Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tema3ArraysEjercicio3 {

    public static void main(String[] args) {

        int[] array = new int[15]; // []que este vacio quieree decir que nio hay mosca en esa posicion


        Random rand = new Random();
        int moscaPosicion = rand.nextInt(15);
        array[moscaPosicion] = 1;  //posicion empieza desde 1


        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenido al juego");
        System.out.println("Elige una posicion entre 1 y 15 para intentar atrapar la mosca");
        boolean fin = false;
        while (fin == false) {
            intentos++;// los intentos que llevas se van sumando

            System.out.print("Elige una posicion entre 1 y 15: ");
            int seleccion = scanner.nextInt();


            if (seleccion < 1 || seleccion > 15) {
                System.out.println("Pon una psocion valida entre 1 y 15");

            }


            seleccion--;// como el array empieza desde 0 y queremos que para el juego empieze desde el 1


            if (seleccion == moscaPosicion) {
                System.out.println("Atrapaste a la mosca en " + (seleccion + 1) + " en " + intentos + " intentos");
                fin = true;
            } else {
                System.out.println("No has atrapado a la mosca. Llevas  " + intentos + "intentos");
            }


            if (Math.abs(moscaPosicion - seleccion) == 1) { // la mosca se mueve si estas cerca del numero

                if (moscaPosicion > 0 && moscaPosicion < 14) {
                    moscaPosicion = rand.nextBoolean() ? moscaPosicion - 1 : moscaPosicion + 1;//posicion de la mosca derecha o izquierda
                } else if (moscaPosicion == 0) {
                    moscaPosicion = 1;
                } else if (moscaPosicion == 14) {
                    moscaPosicion = 13;
                }
            }
        }

    }
}