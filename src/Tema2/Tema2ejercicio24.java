package Tema2;
import java.util.Scanner;

public class Tema2ejercicio24 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce numero de alumnos:");
        int numalumnos= input.nextInt();

        int aprobados=0;
        int suspendidos=0;

        int contalumn=1;

        while(contalumn<=numalumnos){
            System.out.println("Introduce la nota del alumno:"+contalumn);
            int nota=input.nextInt();

            if(nota >=5){
                aprobados++;
                System.out.println("Alunmo aprobado.");
            } else{
                suspendidos++;
                System.out.println("Alumno suspendido.");
            }
            contalumn++;
        }
        input.close();
    }
}
