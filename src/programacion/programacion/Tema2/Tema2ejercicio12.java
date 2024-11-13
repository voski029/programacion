package Tema2;
import java.util.Scanner;

public class Tema2ejercicio12 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("introduce numero1:");
        int numero1=input.nextInt();
        System.out.println("introduce numero2:");
        int numero2=input.nextInt();
        System.out.println("introduce numero3:");
        int numero3=input.nextInt();

        if (numero1>numero2 && numero1>numero3) {
            System.out.println("Los numeros estan ordenador de mayor a menor");}
        else {
            System.out.println("Los numeros no estan ordenados");
        }

    }
}
