package Tema2;
import java.util.Scanner;

public class Tema2ejercicio10 {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);

    System.out.println("Introduce numero1:");
    int numero1=input.nextInt();
    System.out.println("Introduce numero2:");
    int numero2=input.nextInt();
    System.out.println("Introduce numero3:");
    int numero3=input.nextInt();

    if(numero1<numero2 && numero2<numero3){
        System.out.println("Los numeros estan ordenador de menor a mayor");}
    else{
        System.out.println("Los numeros no estan ordenados");
        input.close();
        }
    }

}
