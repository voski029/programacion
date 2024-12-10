package Tema3;

public class Tema3ejercicio9 {
        public static void main(String[] args) {
            showTriangle('*', 5);
        }

        public static void showTriangle(char caracter, int lineas) {
            for (int i = 1; i <= lineas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
        }
    }

