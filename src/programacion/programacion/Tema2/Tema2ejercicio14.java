package Tema2;
import java.util.Scanner;
public class Tema2ejercicio14 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce el numero de personas:");
        int personas= input.nextInt();
        System.out.println("Introduce los dias que estaran:");
        int dias=input.nextInt();

        int precio=15;
        int total=precio*personas*dias;

        if(personas>5 && dias>=7);
        {
            total *= 0.75;
        }
    System.out.println("El precio total del camping es:"+total);

        input.close();

    }
}

