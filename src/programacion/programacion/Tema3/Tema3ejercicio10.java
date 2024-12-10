package Tema3;

import java.util.Scanner;

public class Tema3ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Opciones");
            System.out.println("1 Muestra el signo de un numero");
            System.out.println("2 Indica si eres mayor de edad");
            System.out.println("3 Calcula el area y perimetro de un circulo");
            System.out.println("4 Conversor de euros a dolares y de dolares a euros");
            System.out.println("5 Mostrar tabla de multiplicar de un numero");
            System.out.println("6 Mostrar tablas de multiplicar del 1 al 10");
            System.out.println("7 Comprobador de numeros primos");
            System.out.println("8 Comprobador de fechas");
            System.out.println("9 Dibujar triangulos");
            System.out.println("0 Salir");
            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    numberSign();
                    break;
                case 2:
                    isAdult();
                    break;
                case 3:
                    calculateCircle();
                    break;
                case 4:
                    eurosDollar();
                    break;
                case 5:
                    multiplicationTable();
                    break;
                case 6:
                    allMultiplicationTables();
                    break;
                case 7:
                    primoNumber();
                    break;
                case 8:
                    dayMonthYear();
                    break;
                case 9:
                    Triangle();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        input.close();
    }

    public static void numberSign() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num == 0) {
            System.out.println("El numero es neutro");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    public static void isAdult() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }

    public static void calculateCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo: ");
        double radio = input.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void eurosDollar() {
        Scanner input = new Scanner(System.in);
        System.out.println("1 Euros a Dolares");
        System.out.println("2 Dolares a Euros");
        System.out.print("Elige una opcion: ");
        int opcion = input.nextInt();
        System.out.print("Introduce la cantidad: ");
        double cantidad = input.nextDouble();

        if (opcion == 1) {
            System.out.println(cantidad + " Euros son " + (cantidad * 1.1) + " Dolares");
        } else if (opcion == 2) {
            System.out.println(cantidad + " Dolares son " + (cantidad * 0.91) + " Euros");
        } else {
            System.out.println("Opcion no valida");
        }
    }

    public static void multiplicationTable() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void allMultiplicationTables() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void primoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo && num > 1) {
            System.out.println(num + " es un numero primo");
        } else {
            System.out.println(num + " no es un numero primo");
        }
    }

    public static void dayMonthYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el dia: ");
        int dia = input.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = input.nextInt();
        System.out.print("Introduce el ano: ");
        int ano = input.nextInt();

        boolean fechaValida = true;
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            fechaValida = false;
        }

        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) fechaValida = false;
            } else {
                if (dia > 28) fechaValida = false;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) fechaValida = false;
        }

        if (fechaValida) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha no es valida");
        }
    }

    public static void Triangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el caracter: ");
        char caracter = input.next().charAt(0);
        System.out.print(" Numero de lineas: ");
        int lineas = input.nextInt();

        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

