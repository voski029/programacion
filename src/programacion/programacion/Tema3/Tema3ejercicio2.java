package Tema3;
import java.util.Scanner;

public class Tema3ejercicio2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int number = input.nextInt();
        int result = numberSign(number);

        if (result == 0) {
            System.out.println("El número es 0.");
        } else if (result == 1) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }

        System.out.print("Introduce tu edad: ");
        int age = input.nextInt();

        if (isAdult(age)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }

    public static int numberSign(double num) {
        if (num == 0) {
            return 0;
        } else if (num > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }
}