package Tema2;


import java.util.Scanner;



public class Tema2ejercicio20 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Introduce el numero A:");
        int A= input.nextInt();

        System.out.println("Escribe el numero B:");
        int B = input.nextInt();

        if (B>A){
            System.out.println("Los numeros impares entre" +A+ "y" +B+ "son:");
           for ( numero=A+1;numero <B;numero++) {
               if (numero % 2 != 0) {
                   System.out.println("impares" + numero);
               }
           }
        }else{
            System.out.println("B no es mayor,fin del programa");
        }
        input.close();
    }
}
