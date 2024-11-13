package Tema2;
import java.util.Scanner;

public class Tema2ejercicio21 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);// en este caso no hace falta porque no ponemos el numero nostros
        System.out.println("Calcula la suma:");
        int suma=0;
        int numero;
        for(numero=2;numero<=1000;numero+=2);
        suma+=numero;

        System.out.println("La suma de todos los mumeros pares es:" +suma);
        input.close();
    }
}
