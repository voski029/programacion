package Tema2;

import java.util.Scanner;

public class Juego {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        String jugador1;
        System.out.println("Escribe el nombre del primer jugador: " );
        jugador1 = input.nextLine();

        System.out.println("Escribe el nombre del segundo jugador: ");
        String jugador2 = input.nextLine();

        int critico;
        int regenaracion;

        //crear barra de vida guiones
        //  int velocidadUno = 120;
        //        int ataqueUno = 100;
        //        int defensaUno = 150;
        //        int puntosVidaUno = 130;


        // Opción 2
        int velocidadDos = 95;
        int ataqueDos = 140;
        int defensaDos = 130;
        int puntosVidaDos = 120;


        // Opción 3 int velocidadTres = 110;
        //        int ataqueTres = 90;
        //        int defensaTres = 170;
        //        int puntosVidaTres = 120;
        //
        //        // Opción 4
        //        int velocidadCuatro = 150;
        //        int ataqueCuatro = 80;
        //        int defensaCuatro = 100;
        //        int puntosVidaCuatro = 160;



        System.out.println("Características de las opciones:");

        //System.out.println("Opción 1 - Velocidad: " + velocidadUno + ", Ataque: " + ataqueUno +
              //  ", Defensa: " + defensaUno + ", Puntos de vida: " + puntosVidaUno);

        System.out.println("Opción 2 - Velocidad: " + velocidadDos + ", Ataque: " + ataqueDos +
                ", Defensa: " + defensaDos + ", Puntos de vida: " + puntosVidaDos);

        //System.out.println("Opción 3 - Velocidad: " + velocidadTres + ", Ataque: " + ataqueTres +
              //  ", Defensa: " + defensaTres + ", Puntos de vida: " + puntosVidaTres);

        //System.out.println("Opción 4 - Velocidad: " + velocidadCuatro + ", Ataque: " + ataqueCuatro +
            //    ", Defensa: " + defensaCuatro + ", Puntos de vida: " + puntosVidaCuatro);

        System.out.println("El jugador 1 tiene las caracteristicas de opcion:");


        int opcionJugador1 = input.nextInt();
        int velocidadJ1 = 0, ataqueJ1 = 0, defensaJ1 = 0, puntosVidaJ1 = 0;

        switch (opcionJugador1) {
            //case 1:   velocidadJ1 = velocidadUno;
            //                ataqueJ1 = ataqueUno;
            //                defensaJ1 = defensaUno;
            //                puntosVidaJ1 = puntosVidaUno;
            //                break;

            case 2:
                velocidadJ1 = velocidadDos;
                ataqueJ1 = ataqueDos;
                defensaJ1 = defensaDos;
                puntosVidaJ1 = puntosVidaDos;
                break;
           // case 3:
                //velocidadJ1 = velocidadTres;
                //ataqueJ1 = ataqueTres;
               // defensaJ1 = defensaTres;
               // puntosVidaJ1 = puntosVidaTres;
              //  break;
           // case 4:  velocidadJ1 = velocidadCuatro;
            //                ataqueJ1 = ataqueCuatro;
            //                defensaJ1 = defensaCuatro;
            //                puntosVidaJ1 = puntosVidaCuatro;
            //                break;
             // default;  System.out.println("Por defecto se selecciona opcion 1.");
            //                velocidadJ1 = velocidadUno;
            //                ataqueJ1 = ataqueUno;
            //                defensaJ1 = defensaUno;
            //                puntosVidaJ1 = puntosVidaUno;
            //                break;


        }
        System.out.println("El jugador 1 elije una de las opciones: " + opcionJugador1);
        System.out.println("Velocidad: " + velocidadJ1 + "ataque: " + ataqueJ1 + "defensa: " + defensaJ1 + "puntos de vida: " + puntosVidaJ1);

        System.out.println("El jugador 2 tiene las caracteristicas de opcion:");
        int opcionJugador2 = input.nextInt();
        int velocidadJ2 = 0, ataqueJ2 = 0, defensaJ2 = 0, puntosVidaJ2 = 0;

        switch (opcionJugador2) {
            //case 1: velocidadJ2 = velocidadUno;
            //                ataqueJ2 = ataqueUno;
            //                defensaJ2 = defensaUno;
            //                puntosVidaJ2 = puntosVidaUno;
            //                break;

            case 2:
                velocidadJ2 = velocidadDos;
                ataqueJ2 = ataqueDos;
                defensaJ2 = defensaDos;
                puntosVidaJ2 = puntosVidaDos;
                break;
           //  case 3:
            //                velocidadJ2 = velocidadTres;
            //                ataqueJ2 = ataqueTres;
            //                defensaJ2 = defensaTres;
            //                puntosVidaJ2 = puntosVidaTres;
            //                break;
            //            case 4:
            //                velocidadJ2 = velocidadCuatro;
            //                ataqueJ2 = ataqueCuatro;
            //                defensaJ2 = defensaCuatro;
            //                puntosVidaJ2 = puntosVidaCuatro;
            //                break;
            //            default:
            //                System.out.println("Por defecto se selecciona opcion 1");
            //                velocidadJ1 = velocidadUno;
            //                ataqueJ1 = ataqueUno;
            //                defensaJ1 = defensaUno;
            //                puntosVidaJ1 = puntosVidaUno;
            //                break;
             //   velocidadJ2 = velocidadTres;
            //    ataqueJ2 = ataqueTres;
              //  defensaJ2 = defensaTres;
                //puntosVidaJ2 = puntosVidaTres;


        }
        System.out.println("El jugador 2 elije una de las opciones: " + opcionJugador2);
        System.out.println("Velocidad: " + velocidadJ2 + "ataque: " + ataqueJ2 + "defensa: " + defensaJ2 + "puntos de vida: " + puntosVidaJ2);



    }
}
