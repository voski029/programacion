package Tema3;

import java.util.Scanner;

public class Tema3ejercicio7 {

    public static void main(String[] args) {
        processNumbers();

    }

    public static void processNumbers() {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            number = getPositiveNumber(input);
            if (number > 0) {
                checkPrimeNumber(number);
            }
        } while (number != 0);
    }

    public static int getPositiveNumber(Scanner input) {
        System.out.print("Introduce un número entero positivo (0 para salir): ");
        return input.nextInt();
    }

    public static void checkPrimeNumber(int number) {
        if (isPrime(number)) {
            System.out.println(number + " es un número primo.");
        } else {
            System.out.println(number + " no es un número primo.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}