package Tema4POO;

import java.util.Scanner;

public class Persona {
    private final String dni; // Se mantiene como String
    private String nombre;
    private String apellido;
    private int edad;
    public static final int adultAge = 18;
    public static final int retiredAge = 65;

    // Constructor con parametros
    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
    }


    public boolean isAdult() {
        return getEdad() >= adultAge;
    }

    public boolean isRetired() {
        return getEdad() > retiredAge;
    }

    public int ageDifference(int personaEdad) {
        return Math.abs(personaEdad - this.getEdad());
    }

    public static String verificarDni(Scanner input) {
        System.out.println("Introduce los 8 primeros numeros del DNI:");
        int dniNumber = input.nextInt();

        if (dniNumber < 10000000 || dniNumber > 99999999) {
            System.out.println("Numero de 8 digitos requerido.");
            return "-1";
        }

        System.out.println("Letra del DNI: ");
        String dniChar = input.next().toUpperCase();

        if (dniChar.length() != 1 || !Character.isLetter(dniChar.charAt(0))) {
            System.out.println("Debe ser una letra.");
            return "";
        }
        return dniNumber + dniChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de los datos de la persona 1
        System.out.println("Dime los datos de persona 1 ");
        System.out.println("DNI:");
        String dni1 = verificarDni(input);

        while (dni1.equals("-1")) {
            System.out.println("DNI incorrecto, tiene que tener 8 números y 1 letra");
            dni1 = verificarDni(input);
        }

        System.out.println("Nombre:");
        String nombre1 = input.next();
        System.out.println("Apellido:");
        String apellido1 = input.next();
        System.out.println("Edad:");
        int edad1 = input.nextInt();

        Persona persona1 = new Persona(dni1, nombre1, apellido1, edad1);

        // Uso de los métodos Get
        System.out.println("Mostrar datos persona 1:");
        persona1.mostrarDatos();
        System.out.println("¿Es mayor de edad? " + persona1.isAdult());
        System.out.println("¿Está jubilado? " + persona1.isRetired());

        // Entrada de los datos de la persona 2
        System.out.println("Dime los datos de persona 2");
        System.out.println("DNI:");
        String dni2 = verificarDni(input);

        while (dni2.equals("-1")) {
            System.out.println("DNI incorrecto, tiene que tener 8 numeros y 1 letra");
            dni2 = verificarDni(input);
        }

        Persona persona2 = new Persona(dni2, "", "", 0);


        System.out.println("Nombre:");
        persona2.setNombre(input.next());
        System.out.println("Apellido:");
        persona2.setApellido(input.next());
        System.out.println("Edad:");
        persona2.setEdad(input.nextInt());


        System.out.println("Mostrar datos persona 2:");
        persona2.mostrarDatos();
        System.out.println("¿Es mayor de edad? " + persona2.isAdult());
        System.out.println("¿jubilado? " + persona2.isRetired());

        // Comparar edades
        System.out.println("La diferencia de edad entre persona1 y persona2 es: " + persona1.ageDifference(persona2.getEdad()) + " años.");
    }
}
