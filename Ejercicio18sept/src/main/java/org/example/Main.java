package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio  de  bucles y while clase");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivina mi color favorito: ");
        String bandera = entrada.nextLine();

        while (!bandera.equals("negro")){

            System.out.println("Error ese no es");
            System.out.println("Intenta de nuevo");
            bandera = entrada.nextLine();
        }

        System.out.println("Muy bien!! acertaste");

    }
}