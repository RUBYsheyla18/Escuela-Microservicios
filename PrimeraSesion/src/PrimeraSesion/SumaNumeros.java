package PrimeraSesion;

import java.util.Scanner;

class SumaNumeros {
    public static void main(String[] args) {
        //crea objeto scanner para obtneer datos
        Scanner entrada = new Scanner(System.in);

        //variables
        int numero1;
        int numero2;
        int suma;

        //lectura de los numeros 1 y 2
        System.out.println("Escriba el primer entero a sumar: ");
        numero1 = entrada.nextInt();

        System.out.println("Escriba el segundo entero a sumar: ");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2; // se realzia la suma de los numero ingresados

        System.out.println("La suma es: " + suma);
    }
}
