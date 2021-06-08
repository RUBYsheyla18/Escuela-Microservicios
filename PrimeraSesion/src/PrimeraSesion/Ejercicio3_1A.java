package PrimeraSesion;

//Ejercicio 3

//Determina si un numero es par o impar
import java.util.Scanner;

class Ejercicio3_1A {

    public static void NumeroPar(int numero1)
    {
        if (numero1 % 2 == 0)
            System.out.println(numero1 + " es par");
        else
            System.out.println(numero1 + " es impar");
    }

    public static void main(String[] args) {

        //crea objeto scanner para obtener datos
        Scanner entrada = new Scanner(System.in);

        //variables
        int numero1;

        //lectura del numero 1
        System.out.println("Escriba el numero a evaluar: ");
        numero1 = entrada.nextInt();

        NumeroPar(numero1);
    }
}
