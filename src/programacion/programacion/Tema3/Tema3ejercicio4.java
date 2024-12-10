package Tema3;

import java.util.Scanner;

public class Tema3ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMenu(input);
        input.close();
    }

    public static void showMenu(Scanner input) {
        int cashOption;
        System.out.println("Opciones:");
        System.out.println("1. Convertir de euros a dolares");
        System.out.println("2. Convertir de dolares a euros");
        System.out.println("3. Salir");
        cashOption = input.nextInt();

        switch (cashOption) {
            case 1:
                System.out.print("Introduce la cantidad en euros: ");
                double cantidadMonedas = input.nextDouble();
                System.out.println(cantidadMonedas + " euros son " + euro2dollar(cantidadMonedas) + " dólares.");
                break;
            case 2:
                System.out.print("Introduce la cantidad en dolares: ");
                cantidadMonedas = input.nextDouble();
                System.out.println(cantidadMonedas + " dolares son " + dollar2euro(cantidadMonedas) + " euros.");
                break;
            case 3:
                System.out.println("Gracias por usar el conversor.");
                break;
            default:
                System.out.println("Opcion incorrecta, no tienes dinero para cambiar");
        }
    }

    public static double euro2dollar(double euros) {
        double dolar = 1.10;
        return euros * dolar;
    }

    public static double dollar2euro(double dollars) {
        double euro = 0.91;
        return dollars * euro;
    }
}