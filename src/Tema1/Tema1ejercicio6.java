import java.util.Scanner;

public class Tema1ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leer valor de radir
        System.out.print("Ingrese el valor del radio: ");
        double r = scanner.nextDouble();

        //calc area con nuemro pi
        double area = 3.14 * r * r;
        System.out.println("El área del círculo es Pi*r*r= " + area);



    }
}