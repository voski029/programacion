package Tema1;

import java.util.Scanner;

public class Tema1ejercicio8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe  numero1:");
        int numero1=input.nextInt();
        System.out.println("Escribe numero2");
        int numero2=input.nextInt();

        if (numero1>numero2){
        System.out.println("El mayor es:"+numero1);
        }
        else if (numero2>numero1){
            System.out.println("El mayor es"+numero2);
        }
        else{
            System.out.println("Los dos numeros son iguales");
        }
        input.close();
    }
        }