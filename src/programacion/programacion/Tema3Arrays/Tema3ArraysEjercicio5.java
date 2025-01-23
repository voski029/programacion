package Tema3Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tema3ArraysEjercicio5 {

    public static void main(String[] args) {

        String[] animales = {"Buho", "Mono", "Suricata", "Leon", "Tigre", "Elefante", "Cebra", "Jirafa", "Hipopotamo", "Tiburon"};


        String[] parejas = new String[20];


        boolean[] visibles = new boolean[20];


        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            String animal = animales[i];

            int posicion1 = rand.nextInt(20);
            while (parejas[posicion1] != null) {// volvera a buscar si es nulo
                posicion1 = rand.nextInt(20);
            }
            parejas[posicion1] = animal;

            int posicion2 = rand.nextInt(20);
            while (parejas[posicion2] != null || posicion2 == posicion1) {
                posicion2 = rand.nextInt(20); //tiene que haber 2 posiciones los animales van por pareja s
            }
            parejas[posicion2] = animal;
        }


        Scanner scanner = new Scanner(System.in);
        int parejasEncontradas = 0;
        while (parejasEncontradas < 10) {

            System.out.println("Estado actual del juego:");
            for (int i = 0; i < 20; i++) {
                if (visibles[i]) {
                    System.out.print(parejas[i] + " ");
                } else {
                    System.out.print("X ");
                }
            }


            System.out.print("Selecciona la primera posición (1-20): ");
            int pos1 = scanner.nextInt() - 1;
            System.out.print("Selecciona la segunda posición (1-20): ");
            int pos2 = scanner.nextInt() - 1;


            if (pos1 < 0 || pos1 >= 20 || pos2 < 0 || pos2 >= 20 || pos1 == pos2) {
                System.out.println("Posiciones no válidas. Intenta de nuevo.");
                continue; //iria null en caso de que no lo pusieras bien
            }


            System.out.println("Primera posicion: " + (pos1 + 1) + " -> " + (visibles[pos1] ? parejas[pos1] : "X"));
            System.out.println("Segunda posicion: " + (pos2 + 1) + " -> " + (visibles[pos2] ? parejas[pos2] : "X"));


            if (parejas[pos1].equals(parejas[pos2])) {
                System.out.println("Encontraste una pareja de aninales");
                visibles[pos1] = true;
                visibles[pos2] = true;
                parejasEncontradas++;
            } else {
                System.out.println("No son iguales,Vuelve a intentarlo.");
            }


            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
            scanner.nextLine();
        }

      
        System.out.println("\n¡Felicidades! Has encontrado todas las parejas.");
        scanner.close();
    }
}