package Tema3;
import java.util.Scanner;

public class Tema3ejercicio3_3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Escribe un numero");
        int number=input.nextInt();

        int numeroDigitos=Metodos.MyMath.numberDigits(number);
        System.out.println("El numero tiene " +numeroDigitos+ " digitos ");
    }
}
