package Tema3;
import java.util.Scanner;

public class Tema3ejercicio5{


    public class MultiplicationTable {
        public static void main(String[] args) {
            int number = getNumber();
            printMultTable(number);
        }

        public static int getNumber() {
            Scanner input = new Scanner(System.in);
            int number=input.nextInt();
            if (number<1||number<10){
                System.out.println("Numero no valido ");
                number= input.nextInt();
            }
            do {
                System.out.print("Introduce un numero valido  entre 1 y 10: ");
                number = input.nextInt();
            } while (number < 1 || number > 10);
            return number;
        }

        public static void printMultTable(int number) {
            System.out.println("Tabla de multiplicar del " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}