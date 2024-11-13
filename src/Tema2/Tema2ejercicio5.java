package Tema2;
import java.util.Scanner;

public class Tema2ejercicio5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce numero 1:");
        double numero1=input.nextDouble();
        System.out.println("Introduce numero2:");
        double numero2=input.nextDouble();
        System.out.println("Introduce numero3");
        double numero3=input.nextDouble();

        double media=(numero1+numero2+numero3)/3;
        System.out.println("La media con decimal:"+media);
        System.out.println("La media sin decimal:"+(int)media);//al conventir al int se queda sin decimales

        input.close();

    }
}
