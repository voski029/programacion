package Tema2;

public class Tema2ejercicio27 {
    public static void main(String[] args) {
        int contar = 0;
        int numero = 2;
        while (contar < 20) {
            boolean numeroprimo = true;
            if (numero <= 1) {
                numeroprimo = false;
            } else {
                for (int divisor = 2; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        numeroprimo = false;
                        break;
                    }
                }
            }
            if (numeroprimo) {

                System.out.println(numero+  "Es primo");
                contar++;
            }
            numero++;
        }
    }
}