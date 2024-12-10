package Tema3;
import java.util.Scanner;

public class Tema3ejercicio5_5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Escribe un numero");
        int number=input.nextInt();
        int numeroImpar=Metodos.MyMath.numberImpar(number);
        System.out.println("El contador tiene "+numeroImpar+ " numeros impares");
        input.close();
    }
}
