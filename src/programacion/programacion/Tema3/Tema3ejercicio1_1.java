package Tema3;
import java.util.Scanner;

public class Tema3ejercicio1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado = input.nextDouble();
        System.out.println("Perimetro Cuadrado" + Metodos.MyMath.squarePerimeter(lado));
        System.out.println("Area Cuadrado" + Metodos.MyMath.squareArea(lado));
        double largo = input.nextDouble();
        double ancho = input.nextDouble();
        System.out.println("Perimetro Rectangulo" + Metodos.MyMath.rectanglePerimeter(largo, ancho));
        System.out.println("Area rectangulo" + Metodos.MyMath.rectangleArea(largo, ancho));
        double radius = input.nextDouble();
        System.out.println("Perimetro Circulo" + Metodos.MyMath.circlearea(radius));
        System.out.println("Area Circulo");
        input.close();

    }
}

