package Tema3;

public class Metodos {
    public static class MyMath {


        public static double squarePerimeter(double lado) {
            return 4 * lado;
        }

        public static double squareArea(double lado) {
            return lado * lado;
        }

        public static double rectanglePerimeter(double largo, double ancho) {
            return 2 * (largo + ancho);
        }

        public static double rectangleArea(double largo, double ancho) {
            return largo * ancho;
        }

        public static double circlearea(double radius) {
            return 3.14 * radius * radius;
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static int numberDigits(int number) {
            int contador = 0;
            if (number < 0) {
                number = -number;
            }
            while (number > 0) {
                number = number / 10;
                contador++;
            }
            return contador;

        }

        public static int numberPar(int number) {
            int contadorPares = 0;
            if (number < 0) {
                number = -number;
            }
            while (number > 0) {
                int digito = number % 10;
                if (digito % 2 == 0) {
                    contadorPares++;
                }
                number = number / 10;
            }
            return contadorPares;
        }

        public static int numberImpar(int number) {
            int contadorImpares = 0;
            if (number < 0) {
                number = -number;
            }
            while (number > 0) {
                int digito = number % 10;
                if (digito % 2 != 0) {
                    contadorImpares++;
                }
                number = number / 10;
            }
            return contadorImpares;
        }

        public static int factorial(int number) {

            if (number == 0) {
                return 1;
            }
            int result = 1;
            for (int i = 1; i < number; i++) {
                result = result * i;
            }
            return result;
        }

        public static int factorialRecursive(int number) {

            if (number == 0) {
                return 1;
            } else {
                return number * factorialRecursive(number - 1);
            }
        }

        public static int solutionsEcua(int a, int b, int c) {
            int discriminante = (b * b) - (4 * a * c);

            if (discriminante > 0) {
                return 2;
            } else if (discriminante == 0) {
                return 1;
            } else {
                return 0;
            }
            /*
            public static int numberEntero(int number){
                int contador = 0;
                if (number < 0) {
                    number =- number;
                }

                }

             */

        }

    }
}



















