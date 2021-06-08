package PrimeraSesion;

//Ejercicio 2

//Determina el mayor de 2 numeros enteros
import java.util.Scanner;

class Ejercicio2_1A {

    public static void Mayor(int numero1, int numero2)
    {
        if (numero2 == numero1)
            System.out.println("Los numeros son iguales");
        else
        {
            if(numero1>numero2)
                System.out.println(numero1 + " es mayor");
            else
                System.out.println(numero2 + " es mayor");
        }
    }
    public static void main(String[] args) {

        //crea objeto scanner para obtneer datos
        Scanner entrada = new Scanner(System.in);

        //variables
        int numero1;
        int numero2;

        //lectura de los numeros 1 y 2
        System.out.println("Escriba el primer entero a comparar: ");
        numero1 = entrada.nextInt();

        System.out.println("Escriba el segundo entero a comparar: ");
        numero2 = entrada.nextInt();

        Mayor(numero1,numero2);

    }
}
