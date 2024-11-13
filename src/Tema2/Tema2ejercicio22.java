package Tema2;
import java.util.Scanner;

public class Tema2ejercicio22 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Escribe un numero:");

        int numero= input.nextInt();
        int contar=0;

        if (numero==0){
            contar=1;
        }else {
            while (numero > 0) {
                numero = numero / 10;
                contar++;
            }

        System.out.println("El numero tiene" +contar+ "cifras");
            }
        input.close();
        }
    }

