package Tema2;
import java.util.Scanner;

public class Tema2ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el número del mes (1-12): ");
        int mes = input.nextInt();
        System.out.println("Introduce el año: ");
        int year = input.nextInt();
        int dias = 0;

        switch (mes) {
            case 1: // enero
            case 3: // marzo
            case 5: // mayo
            case 7: // julio
            case 8: // agosto
            case 10: // octubre
            case 12: // diciembre
                dias = 31;
                break;
            case 4: // sbril
            case 6: // junio
            case 9: // septiembre
            case 11: // noviembre
                dias = 30;
                break;
            case 2: // febreroo
                if (year%4==0) {
                    dias = 29; // Año bisiesto
                } else {
                    dias = 28; // Año no bisiesto
                }
                break;
            default:
                System.out.println("Mes no válido. Debe estar entre 1 y 12.");
                input.close();
                return;
        }


        System.out.println("El mes " + mes + " del año " + year + " tiene " + dias + " días.");

        input.close();
    }
}