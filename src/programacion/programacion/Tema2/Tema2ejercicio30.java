package Tema2;
import java.util.Scanner;

public class Tema2ejercicio30 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        String operacion;

        while (true) {
            System.out.print("introduce un numero:");
            num1 = input.nextDouble();

            System.out.print("operaciones");
            operacion = input.next();

            System.out.print("introduce otro numero:");
            num2 = input.nextDouble();

            //cambia todos estos if, por switch
            /*
            if (operacion.equals("+")) {
                resultado = num1 + num2;
                System.out.println("resultado: " + resultado);
            } else if (operacion.equals("-")) {
                resultado = num1 - num2;
                System.out.println("resultado: " + resultado);
            } else if (operacion.equals("*")) {
                resultado = num1 * num2;
                System.out.println("resultado: " + resultado);
            } else if (operacion.equals("/")) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("resultado: " + resultado);
                } else {
                    System.out.println("no se divide entre 0.");
                }
            } else if (operacion.equals("%")) {
                if (num2 != 0) {
                    resultado = num1 % num2;
                    System.out.println("resultado: " + resultado);
                } else {
                    System.out.println("no se puede hacer modulo con 0.");
                }
            } else {
                System.out.println("operación no válida.");
            }
*/
            System.out.print("¿otra operacion?(si/n0): ");
            String respuesta = input.next();

            if (respuesta.equals("n0")) {
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                break;
            }
        }

        input.close();
    }
}