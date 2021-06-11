package SegundaSesion;

import java.util.Scanner;

//uso del constructor de cuenta para inicializar la variable de
//la instancia nombre al momento de crear el objeto cuenta

public class PruebaCuenta {
    public static void main(String[] args) {
        // creacion de dos objetos del tipo Cuenta
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Peluche");
        Cuenta cuenta3 = new Cuenta("Noni");

        //mostrar el valor inicial de nombre de cada Cuenta
        System.out.printf("El nombre de Cuenta1 es: %s %n",cuenta1.getNombre());
        System.out.printf("El nombre de Cuenta2 es: %s %n",cuenta2.getNombre());
        System.out.printf("El nombre de Cuenta3 es: %s %n",cuenta3.getNombre());
    }
}
