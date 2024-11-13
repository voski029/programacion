package Tema2;
import java.util.Scanner;


public class Tema2ejercicio25 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Introduce el numero:");
        int numero=input.nextInt();
        long fact=1;
        int multiplicacion;

        for(multiplicacion=1;multiplicacion<=numero;multiplicacion++){
            fact=fact*multiplicacion;
        }
        System.out.println("EL numero factorial de:"  +numero+  "es:"  +fact) ;

        input.close();
    }

}
