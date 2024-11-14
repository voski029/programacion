package Tema2;
import java.util.Scanner;

public class Tema2ejercicio24 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce numero de alumnos:");
        int numAlumnos= input.nextInt();

        int aprobados=0;
        int suspendidos=0;

        int contAlumn=1;

        while(contAlumn<=numAlumnos){
            System.out.println("Introduce la nota del alumno:"+contAlumn);
            int nota=input.nextInt();

            if(nota >=5){
                aprobados++;
                System.out.println("Alunmo aprobado.");
            } else{
                suspendidos++;
                System.out.println("Alumno suspendido.");
            }
                contAlumn++;
        }
        //te falta decir cuantos aprobados y suspendidos hay en total
        input.close();
    }
}
