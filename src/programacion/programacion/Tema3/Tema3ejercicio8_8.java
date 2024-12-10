package Tema3;

import java.util.Scanner;

public class Tema3ejercicio8_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime los 3 cocientes:  ");
        System.out.println("a:");
        int a = input.nextInt();
        System.out.println("b:");
        int b = input.nextInt();
        System.out.println("c:");
        int c = input.nextInt();


        int solucionEcuacionesUno = Metodos.MyMath.solutionsEcua(a, b, c);

        System.out.println("Número de soluciones (x^2 + 2x - 3 =: " + solucionEcuacionesUno);


    }
}
