package Tema3;
import java.util.Scanner;
public class Tema3ejercicio3 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double radius;

            do {
                System.out.print("Introduce  radio");
                radius = input.nextDouble();
            } while (!validRadius(radius));

            double perimeter = calculateCirclePerimeter(radius);
            double area = calculateCircleArea(radius);

            System.out.println("El perimetro es: " + perimeter);
            System.out.println("El area es: " + area);
        }

        public static boolean validRadius(double radius) {
            return radius > 0;
        }

        public static double calculateCirclePerimeter(double radius) {
            return 2 * Math.PI * radius;
        }

        public static double calculateCircleArea(double radius) {
            return Math.PI * radius * radius;
        }
    }

