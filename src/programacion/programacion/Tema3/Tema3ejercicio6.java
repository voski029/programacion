package Tema3;

public class Tema3ejercicio6 {

        public static void main(String[] args) {
            printAllTables();
        }

        public static void printAllTables() {
            for (int number = 1; number <= 10; number++) {
                printTable(number);
                System.out.println();
            }
        }

        public static void printTable(int number) {
            System.out.println("Tabla de multiplicar del " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }

