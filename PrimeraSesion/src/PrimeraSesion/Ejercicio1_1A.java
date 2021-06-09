package PrimeraSesion;

//Ejercicio 1
//Realiza el producto de tres numeros

import java.util.Scanner;


public class Ejercicio1_1A {
    public static int Producto(int num1, int num2, int num3)
    {
        int producto = num1 * num2 * num3; // se realiza el producto de los numero ingresados

        return producto; //Se retorna el producto
    }
    public static void main(String[] args) {

        //crea objeto scanner para obtneer datos
        Scanner entrada = new Scanner(System.in);

        //variables
        int numero1;
        int numero2;
        int numero3;

        //lectura de los numeros 1, 2 y 3
        System.out.println("Escriba el primer entero a multiplicar: ");
        numero1 = entrada.nextInt();

        System.out.println("Escriba el segundo entero a multiplicar: ");
        numero2 = entrada.nextInt();

        System.out.println("Escriba el tercer entero a multiplicar: ");
        numero3 = entrada.nextInt();

        //se escribe el resulta de la operacion
        System.out.println("El producto es: " + Producto(numero1, numero2, numero3));

    }
}
