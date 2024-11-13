package Tema2;
import java.util.Scanner;

public class Tema2ejercicio9 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce el cambio:");
        double cambiodolares=input.nextDouble();
        double preciocambio=0.9;
        double cambioEuros=cambiodolares*preciocambio;

        System.out.println("En euros son:"+cambioEuros);

        input.close();
    }
}


