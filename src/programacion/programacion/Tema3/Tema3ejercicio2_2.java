package Tema3;
import java.util.Scanner;

public class Tema3ejercicio2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dime un numero ");
        int number=input.nextInt();
        Metodos.MyMath.isPrime(number);
        if (Metodos.MyMath.isPrime(number)) {
            System.out.println("El número " + number + " es primo.");
        } else {
            System.out.println("El número " + number + " no es primo.");
        }

        input.close();
    }
}