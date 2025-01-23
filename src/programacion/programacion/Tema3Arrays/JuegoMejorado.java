package Tema3Arrays;

import java.util.Random;
import java.util.Scanner;

public class JuegoMejorado {


    public static void crearPersonaje(Scanner input, String jugador, String nombreJugador) {
        System.out.println(jugador + " ¿Qué personaje quieres? (1: Cura, 2: Científico, 3: Princesa, 4: Ladrón, 5: Crear personaje)");

        int seleccion = input.nextInt();
        while (seleccion < 1 || seleccion > 5) {
            System.out.println("Opción inválida. Escoge un número entre 1 y 5.");
            seleccion = input.nextInt();
        }

        int velocidad = 0, ataque = 0, defensa = 0, puntosVida = 0, vidaInicial = 0;

        switch (seleccion) {
            case 1: // Cura
                velocidad = 120;
                ataque = 100;
                defensa = 150;
                puntosVida = 130;
                vidaInicial = 130;
                break;
            case 2: // Científico
                velocidad = 95;
                ataque = 140;
                defensa = 130;
                puntosVida = 120;
                vidaInicial = 120;
                break;
            case 3: // Princesa
                velocidad = 110;
                ataque = 90;
                defensa = 170;
                puntosVida = 160;
                vidaInicial = 160;
                break;
            case 4: // Ladrón
                velocidad = 150;
                ataque = 80;
                defensa = 100;
                puntosVida = 120;
                vidaInicial = 120;
                break;
            case 5: // Crear personaje
                System.out.println("Crea tu propio personaje:");
                velocidad = crearAtributo(input, "velocidad");
                ataque = crearAtributo(input, "ataque");
                defensa = crearAtributo(input, "defensa");
                puntosVida = crearAtributo(input, "puntos de vida");

                if (velocidad + ataque + defensa + puntosVida > 500) {
                    System.out.println("La suma de las características no puede superar los 500");
                    return;
                }
                vidaInicial = puntosVida;
                break;
        }

        System.out.println(nombreJugador + " ha elegido un personaje con los siguientes atributos:");
        System.out.println("Velocidad: " + velocidad + ", Ataque: " + ataque + ", Defensa: " + defensa + ", Puntos de vida: " + puntosVida);
    }


    public static int crearAtributo(Scanner input, String atributo) {
        int valor = 0;
        System.out.print("Introduce " + atributo + ": ");
        valor = input.nextInt();
        while (valor < 1 || valor > 200) {
            System.out.println("El valor de " + atributo + " debe estar entre 1 y 200.");
            valor = input.nextInt();
        }
        return valor;
    }


    public static int realizarAtaque(int ataque, int defensa, int dado) {
        int daño = Math.max(20, ataque - defensa);
        if (dado == 6) {
            daño *= 4;
            System.out.println("¡Daño Crítico! El daño se multiplica por 4.");
        } else if (dado == 1) {
            System.out.println("¡Haces el daño mínimo!");
        } else if (dado == 2 || dado == 3) {
            daño *= 2;
            System.out.println("¡Haces el doble de daño!");
        }
        return daño;
    }


    public static int regenerarVida(int puntosVida, int regeneracion) {
        if (puntosVida + regeneracion > 200) {
            System.out.println("¡Tu vida ya está al máximo! No puedes regenerar más.");
        } else {
            puntosVida += regeneracion;
            System.out.println("¡Regeneras " + regeneracion + " puntos de vida!");
        }
        return puntosVida;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Escribe el nombre del primer jugador: ");
        String jugador1 = input.nextLine();
        System.out.println("Escribe el nombre del segundo jugador: ");
        String jugador2 = input.nextLine();


        crearPersonaje(input, jugador1, "Jugador 1");
        crearPersonaje(input, jugador2, "Jugador 2");


        System.out.println("¡Que comience la pelea!");
        System.out.println("Presiona Enter para continuar...");
        input.nextLine();
        int turno = (random.nextInt(2) == 0) ? 1 : 2;
        System.out.println("El Jugador " + turno + " ataca primero.");

        int ronda = 1;
        while (true) {
            System.out.println("************************************");
            System.out.println("*********** RONDA " + ronda + " **************");
            System.out.println("************************************");

            // Turno de Jugador 1
            System.out.println(jugador1 + ", tu turno. Tira el dado (1-6): ");
            int dado1 = random.nextInt(6) + 1;
            System.out.println("Sacaste: " + dado1);
            int daño1 = realizarAtaque(100, 150, dado1);
            System.out.println(jugador1 + " inflige " + daño1 + " puntos de daño.");


            System.out.println(jugador2 + ", tu turno. Tira el dado (1-6): ");
            int dado2 = random.nextInt(6) + 1;
            System.out.println("Sacaste: " + dado2);
            int daño2 = realizarAtaque(120, 130, dado2);
            System.out.println(jugador2 + " inflige " + daño2 + " puntos de daño.");

            ronda++;
        }
    }
}