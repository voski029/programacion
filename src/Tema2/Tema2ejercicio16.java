package Tema2;
import java.util.Scanner;

public class Tema2ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double euro_a_dolar = 1.1;
        final double dolar_a_euro = 0.9;

        System.out.println("Introduce 'D' para convertir  euro a dolares o 'E' para convertir dolare a euro: ");
        char opcion = input.next().charAt(0);


        if (opcion == 'D') {
            System.out.println("Introduce la cantidad en euros: ");
            double euros = input.nextDouble();
            double dolares = euros * euro_a_dolar;
            System.out.println("En euros son "+euros+ "y " +dolares+ "en dolares");
        } else if (opcion == 'E') {
            System.out.println("Introduce la cantidad en dólares: ");
            double dolares = input.nextDouble();
            double euros = dolares * dolar_a_euro;
            System.out.println("En dolares son "+dolares+ "y son "+euros+ "en euros" );
        } else {
            System.out.println("Opción no válida. Debe ser 'D' o 'E'.");
        }

        input.close();
    }
}

