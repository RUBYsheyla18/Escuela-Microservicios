package EjerciciosSegundaSesion;

//InversorDeNumeros.java

//invierte un numero ingresado

import java.util.Scanner;

public class InversorDeNumeros {
    public static int inversorNumeros(int numero){
        //incializamos las variables
        int auxNumero;//auxNumero sera el numero ingresado, mas cambiara segun la division entre 10, sera el cociente
        int inversoNumero = 0;//es inversoNumero se almacenara el numero invertido
        int cifraNumero;//cifraNumero sera el residuo de dividir aux entre 10

        //inicializamos aux con el numero ingresado
        auxNumero = numero;

        //el bucle parara solo cuando auxNumero sea igual a cero, en otras palabras
        //cuando auxNumero sea de un solo digito
        while (auxNumero!=0){
            //obtenemos la ultima cifra del valor almacenado en auxNumero
            cifraNumero = auxNumero % 10;

            //inversorNumero almacenara el mismo numero multiplicado por 10 y sumado a ello
            //la ultima cifra extraida en cifraNumero
            inversoNumero = inversoNumero * 10 + cifraNumero;

            //auxNumero numero sera actualizado, extrayendo la ultima cifra mediante una division entera entre 10
            auxNumero  = auxNumero  / 10;
        }

        //devuelve el numero invertido
        return inversoNumero;

    }

    public static void main(String[] args) {
        //creacion del scanner
        Scanner lectura = new Scanner(System.in);

        //pregunta si desea ejecutar la aplicacion
        //flat es para determinar la continuidad de la aplicacion
        int bandera = 1;

        while (bandera == 1){
            //Solicita y lee el numero a evaluar
            System.out.println("Ingrese un numero a invertir: ");
            int numero = lectura.nextInt();

            //realizamos la inversion de las cifras del numero ingresado y lo mostramos en consola
            System.out.printf("El numero invertido de %d es: %n%d %n",numero,inversorNumeros(numero));

            //pregunta si desea continuar con la aplicacion
            System.out.println("Desea continuar con la aplicacion (1/0): ");
            bandera = lectura.nextInt();
        }
    }
}
