package Tema2;

import java.util.Scanner;

public class Tema2ejercicio1{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Introduce el valor del lado del cuadrado:");
        double lado= in.nextDouble();
        double perimetro=4*lado;
        double superficie= lado*lado;
        System.out.println("El perimetro del cuadrado:"+perimetro);
        System.out.println("La superficie del cuadrado:"+superficie);




    }
}