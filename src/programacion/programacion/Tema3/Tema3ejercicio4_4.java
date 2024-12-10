package Tema3;
import java.util.Scanner;

public class Tema3ejercicio4_4 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Escribe un numero");
        int number= input.nextInt();
        int contadorPares=Metodos.MyMath.numberPar(number);
        System.out.println("El contador tiene "+contadorPares+ "numeros pares");
    }
}
