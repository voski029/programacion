package Tema2;
import java.util.Scanner;

public class Tema2ejercicio26 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un numero entero:");
        int entero = input.nextInt();
        int divisor;

            boolean numeroprimo = true;
           if(entero <=1) {
               numeroprimo = false;
           }else {
               for (divisor = 2; divisor < entero; divisor++) {
                   if (entero % divisor == 0) {
                       numeroprimo = false;
                       break;
                   }
               }
           }
               if(numeroprimo){
                           System.out.println(entero+ "es un numero primo");
                       }else {
                           System.out.println(entero+ "no es primo ");
                       }


            input.close();
        }
    }




