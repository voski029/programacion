package Tema1;

import java.util.Scanner;

public class Tema1ejercicio12 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Poner año:");
        int year =in.nextInt();
        int resto =year%4;//al dividir numero entre 4 resto 0 , dar year bisiesto

        if (resto==0){//resultado del resto es 0 se cumple la condicion de ao bisiesto
            System.out.println("El año "+year+" es bisiesto");}
        else{
            System.out.println("El año "+year+ " no es bisiesto");

    }

        in.close();
}
}



