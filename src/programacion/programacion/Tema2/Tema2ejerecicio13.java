package Tema2;
import java.util.Scanner;

public class Tema2ejerecicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = 0;
        int min = 0;
        int seconds = 0;

        System.out.println("Introduce las horas:");
        hours = input.nextInt();
        System.out.println("Introduce los minutos:");
        min = input.nextInt();
        System.out.println("Introduce los segundos:");
        seconds = input.nextInt();
        seconds++;

        if (seconds == 60) {
            min++; //si queremos sumar mas de 1 min=min+5 por ejemplo
            seconds = 0;
        }
        if (min == 60) {
            hours++;
            min = 0;
        }
        if (hours == 24) {
            hours = 0;
            min = 0;
            seconds = 0;
        }

        System.out.println("Horas:" + hours);
        System.out.println("Segundos:" + seconds);
        System.out.println("Minutos:" + min);
        input.close();



    }
}