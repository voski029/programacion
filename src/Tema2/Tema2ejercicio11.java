package Tema2;
import java.util.Scanner;

public class Tema2ejercicio11 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Introduce el numero1");
        int numero1=input.nextInt();
        System.out.println("Introduce el numero2");
        int numero2=input.nextInt();
        System.out.println("Introduce el numero3");
        int numero3=input.nextInt();

        if (Math.abs(numero1 - numero2) == 1 && Math.abs(numero2 - numero3) == 1) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números NO son consecutivos.");
        }
        input.close();
    }
}
