package Tema2;

import java.util.Scanner;

public class Tema2ejercicio3{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Valor de altura  del triangulo:");
        System.out.print("Valor de  base del triangulo:");
        double altura= input.nextDouble();
        double base= input.nextDouble();
        double superficie= 1/2*(base*altura);

        System.out.println("La superficie del triangulo:"+superficie);




    }
}