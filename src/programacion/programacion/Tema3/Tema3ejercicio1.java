package Tema3;
import java.util.Scanner;

public class Tema3ejercicio1 {
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
    }

    public static int numberSign( int num) {
        if (num == 0) {
            return 0;
        } else if (num > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
