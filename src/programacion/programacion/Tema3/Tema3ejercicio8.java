package Tema3;

import java.util.Scanner;

public class Tema3ejercicio8 {
    public static void main(String[] args) {
        DayMonthYear();

    }

    public static void DayMonthYear() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int day = input.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int month = input.nextInt();
        System.out.print("Introduce el año: ");
        int year = input.nextInt();

        if (isValidDate(day, month, year)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha no es correcta.");
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31) return false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) return false;
                break;
            case 2:
                if (bisistoYear(year)) {
                    if (day < 1 || day > 29) return false;
                } else {
                    if (day < 1 || day > 28) return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public static boolean bisistoYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}





