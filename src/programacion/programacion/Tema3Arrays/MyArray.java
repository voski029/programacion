package Tema3Arrays;

import java.util.Scanner;


public class MyArray {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = null;
        int[] numeros2 = null;

        while (true) {

            System.out.println("Elige una operación:");
            System.out.println("1. Imprimir un vector");
            System.out.println("2. Saber el máximo de un vector");
            System.out.println("3. Saber el mínimo de un vector");
            System.out.println("4. Saber la media de un vector");
            System.out.println("5. Comprobar si un número existe en el vector");
            System.out.println("6. Sumar dos vectores");
            System.out.println("7. Restar dos vectores");
            System.out.println("8. Producto escalar de dos vectores");
            System.out.println("9. Invertir un vector");
            System.out.println("10. Comprobar si un vector es capicúa");
            System.out.println("0. Salir");

            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    //existe numero en el vector??
                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        imprimirArray(numeros);
                    }
                    break;
                case 2:

                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        System.out.println("El número más grande es: " + saberMaximo(numeros));
                    }
                    break;
                case 3:

                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        System.out.println("El número más pequeño es: " + saberMinimo(numeros));
                    }
                    break;
                case 4:

                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        System.out.println("La media es: " + saberMedia(numeros));
                    }
                    break;
                case 5:

                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        System.out.println("Introduce el número a buscar:");
                        int numeroABuscar = input.nextInt();
                        int resultado = existeArray(numeros, numeroABuscar);
                        if (resultado != -1) {
                            System.out.println("El número " + numeroABuscar + " está en la posición: " + resultado);
                        } else {
                            System.out.println("El número " + numeroABuscar + " no está en el array.");
                        }
                    }
                    break;
                case 6:

                    System.out.println("Introduce el tamaño del primer vector:");
                    int tamano = input.nextInt();
                    numeros = new int[tamano];
                    System.out.println("Introduce los elementos del primer vector:");
                    for (int i = 0; i < tamano; i++) {
                        numeros[i] = input.nextInt();
                    }

                    System.out.println("Introduce el tamaño del segundo vector:");
                    tamano = input.nextInt();
                    numeros2 = new int[tamano];
                    System.out.println("Introduce los elementos del segundo vector:");
                    for (int i = 0; i < tamano; i++) {
                        numeros2[i] = input.nextInt();
                    }

                    sumaVectores(numeros, numeros2);
                    break;
                case 7:

                    if (numeros == null || numeros2 == null) {
                        System.out.println("Primero crea dos vectores.");
                    } else {
                        restaVectores(numeros, numeros2);
                    }
                    break;
                case 8:

                    if (numeros == null || numeros2 == null) {
                        System.out.println("Primero crea dos vectores.");
                    } else {
                        productoEscalar(numeros, numeros2);
                    }
                    break;
                case 9:

                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        int[] invertido = invertirArray(numeros);
                        System.out.println("El vector invertido es:");
                        imprimirArray(invertido);
                    }
                    break;
                case 10:

                    if (numeros == null) {
                        System.out.println("Primero crea un vector.");
                    } else {
                        if (esCapicua(numeros)) {
                            System.out.println("El vector es capicúa.");
                        } else {
                            System.out.println("El vector no es capicúa.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    input.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int saberMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public static int saberMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static double saberMedia(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return (double) suma / array.length;
    }

    public static int existeArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static void sumaVectores(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener la misma longitud para poder sumarlos.");
            return;
        }
        int suma = 0;
        for (int i = 0; i < vector1.length; i++) {
            suma += vector1[i] + vector2[i];
        }
        System.out.println("La suma de los vectores es: " + suma);
    }

    public static void restaVectores(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener la misma longitud para poder restarlos.");
            return;
        }
        int resta = 0;
        for (int i = 0; i < vector1.length; i++) {
            resta += vector1[i] - vector2[i];
        }
        System.out.println("La resta de los vectores es: " + resta);
    }

    public static void productoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener la misma longitud para calcular el producto escalar.");
            return;
        }
        int escalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            escalar += vector1[i] * vector2[i];
        }
        System.out.println("El producto escalar de los vectores es: " + escalar);
    }

    public static int[] invertirArray(int[] numeros) {
        int[] arrayInvertido = new int[numeros.length];
        int j = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            arrayInvertido[j] = numeros[i];
            j++;
        }
        return arrayInvertido;
    }

    public static boolean esCapicua(int[] numeros) {
        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio < fin) {
            if (numeros[inicio] != numeros[fin]) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
