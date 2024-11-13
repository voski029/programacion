package Tema2;
import java.util.Scanner;

public class Tema2ejercicio17 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce 0 para cuadrado, 1 para rectángulo, o 2 para triángulo: ");
        int datos_figuras=input.nextInt();

        if(datos_figuras==0){
            System.out.println("Pon la longitud del cuadrado ");
            int lado=input.nextInt();
            int superficiecuadrado=lado*lado;
            int perimetrocuadrado=4*lado;

            System.out.println("Superficie del cuadrado:"+superficiecuadrado);
            System.out.println("perimetro del cuadrado:"+perimetrocuadrado);}
        else if(datos_figuras==1){
            System.out.println("Pon la longitud del rectangulo");
            int longitud=input.nextInt();
            System.out.println("Pon la anchura del rectangulo");
            int anchura=input.nextInt();
            int superficierectangulo=longitud*anchura;
            int perimetrorectangulo=2*(longitud+anchura);

            System.out.println("Superficie del rectangulo:"+superficierectangulo);
            System.out.println("perimetro del rectangulo:"+perimetrorectangulo);

        } else if (datos_figuras == 2) {
            System.out.print("pon la base del triángulo: ");
            int base = input.nextInt();
            System.out.print("pon la altura del triángulo: ");
            int altura = input.nextInt();
            int superficietriangulo = (base * altura) / 2;

            System.out.printf("Superficie del triángulo:"+superficietriangulo);

        } else {

            System.out.println("Error: Opción no válida.");
        }

        input.close();
    }
}