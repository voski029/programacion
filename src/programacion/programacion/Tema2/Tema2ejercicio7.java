package Tema2;
import java.util.Scanner;

public class Tema2ejercicio7 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

    System.out.println("Escribe numero1:");
    int numero1=input.nextInt();
    System.out.println("Escribir numero2:");
    int numero2= input.nextInt();


    if(numero1>numero2){
        System.out.println("La resta del mayor1:"+(numero1-numero2));}
    else{
        System.out.println("La resta del mayor2:"+(numero2-numero1));}

    input.close();
        }

    }


