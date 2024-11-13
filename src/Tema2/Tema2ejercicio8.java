package Tema2;
import java.util.Scanner;

public class Tema2ejercicio8 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce el cambio:");
        double cambioeuros=input.nextDouble();
        double preciocambio=1.1;
        double cambio$=cambioeuros*preciocambio;

        System.out.println("En dolares son:"+cambio$);

        input.close();
    }
}
