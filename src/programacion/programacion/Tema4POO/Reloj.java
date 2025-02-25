package Tema4POO;

import java.util.Scanner;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    // Constructor sin parametros
    public Reloj() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor con parametros
    public Reloj(int hora, int minutos, int segundos) {
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    // Setters con validaciones
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {  // Validación para horas
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {  // Validación para minutos
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos.");
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {  // Validación para segundos
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos.");
        }
    }

    // Método que muestra la hora
    public void mostrarHora() {
        System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);
    }

    //metodo to string
    public String toString() {
        return "La hora es: " + hora + ":" + minutos + ":" + segundos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar hora, minutos y segundos al usuario
        System.out.println("Introduce la hora:");
        int hora = input.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos = input.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos = input.nextInt();

        // Crear un objeto Reloj con los valores introducidos
        Reloj reloj = new Reloj(hora, minutos, segundos);

        //Al intentar imprimir el objeto reloj sin implementar el metodo tostring Tema4POO.Reloj@6acbcfc0
        System.out.println(reloj);  // Esto imprime lo que hay por defecto en reloj


        // Comentario: Al implementar to string imprime objeto reloj

        reloj.mostrarHora();
    }
}