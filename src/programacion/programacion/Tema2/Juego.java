package Tema2;
import java.util.Arrays;
import java.util.Scanner;

public class Juego {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Los jugadores son:");
        String jugador1 =input.nextLine();
        System.out.println("Escribe el nombre del primer jugador: "+jugador1);
        String jugador2=input.nextLine();
        System.out.println("Escribe el nombre del segundo jugador: "+jugador2);
        int critico;
        int regenaracion;
        //crear barra de vida guiones

        int opcionUno[];
        //Escoger las opciones de las caracteristicas de los personajes

        opcionUno=new int[4];
        int velocidadUno=120;
        int ataqueUno=100;
        int defensaUno=150;
        int puntosVidaUno=130;
        System.out.println("Caracteristicas 1"+opcionUno);
        System.out.println("Velocidad: "+opcionUno[0]);
        System.out.println("Ataque: "+opcionUno[1]);
        System.out.println("Defensa: "+opcionUno[2]);
        System.out.println("Puntos de vida: "+opcionUno[3]);


        int opcionDos[];
        //caracteristicas opcion 2

        opcionDos=new int[4];
        int velocidadDos=95;
        int ataqueDos=140;
        int defensaDos=130;
        int puntosVidaDos=120;
        System.out.println("Caracteristicas 2"+opcionDos);
        System.out.println("Velocidad: "+opcionDos[0]);
        System.out.println("Ataque: "+opcionDos[1]);
        System.out.println("Defensa: "+opcionDos[2]);
        System.out.println("Puntos de vida: "+opcionDos[3]);

        int opcionTres[];
        //caracteristicas3
        opcionTres=new int[4];

        int velocidadTres=110;
        int ataqueTres=90;
        int defensaTres=170;
        int puntosVidaTres=120;
        System.out.println("Caracteristicas 3: "+opcionTres);
        System.out.println("Velocidad: "+opcionTres[0]);
        System.out.println("Ataque: "+opcionTres[1]);
        System.out.println("Defensa: "+opcionTres[2]);
        System.out.println("Puntos de vida: "+opcionTres[3]);

        int opcionCuatro[];
        //caracteristicas4
        opcionCuatro=new int[4];
        int valocidadCuatro=150;
        int ataqueCuatro=80;
        int defensaCuatro=100;
        int puntosVidaCuatro=160;

        System.out.println("Caracteristicas 4:"+opcionCuatro);
        System.out.println("Velocidad: "+opcionCuatro[0]);
        System.out.println("Ataque: "+opcionCuatro[1]);
        System.out.println("Defensa: "+opcionCuatro[2]);
        System.out.println("Puntos de vida: "+opcionCuatro[3]);










    }
}
