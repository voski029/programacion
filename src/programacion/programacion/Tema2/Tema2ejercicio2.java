package Tema2;

import java.util.Scanner;

public class Tema2ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del lado del cuadrado:");
        double altura= scanner.nextDouble();
        double base= scanner.nextDouble();
        double perimetro=2*(base+altura);
        double superficie= altura*base;
        System.out.println("El perimetro del cuadrado:"+perimetro);
        System.out.println("La superficie del cuadrado:"+superficie);




    }
}