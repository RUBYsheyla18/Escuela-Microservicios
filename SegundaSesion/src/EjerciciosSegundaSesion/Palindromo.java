package EjerciciosSegundaSesion;
//Palindromo.java
//Verifica si un numero es palindromo o capicua

import java.util.Scanner;

public class Palindromo {
    public static boolean esCincoCifras(int numero)
    {
        int cifras= 0;    //contador de cifras del numero
        while(numero!=0){             //se ejecutara mientras que al numero le queden cifras por contar
            numero = numero/10;         //dividimos entre 10 para quitar el ultimo digito
            cifras++;          //aumentamos la cantidad de cifras
        }

        if (cifras != 5)
            return false;
        else
            return true;
    }

    public static boolean esPalindromo(int numero){
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

        //se verifica si el numero obtenido en inversoNumero es el mismo que numero
        if(numero == inversoNumero){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

        //creacion del scanner
        Scanner lectura = new Scanner(System.in);

        //pregunta si desea ejecutar la aplicacion
        //flat es para determinar la continuidad de la aplicacion
        int bandera = 1;

        while (bandera == 1){
            //Solicita y lee el numero a evaluar
            System.out.println("Ingrese un numero de 5 digitos: ");
            int numero = lectura.nextInt();

            //en caso el numero no cumpla con la regla de ser de 5 digitos
            while (!esCincoCifras(numero)) {
                System.out.print("Error, ingrese un numero de 5 digitos: ");
                numero = lectura.nextInt();
            }

            //realizamos la verificacion de si el numero es palindromo o no

            if (esPalindromo(numero)) {
                System.out.printf("El numero %d es palindromo %n", numero);
            } else {
                System.out.printf("El numero %d no es palindromo %n", numero);
            }

            //pregunta si desea continuar con la aplicacion
            System.out.println("Desea continuar con la aplicacion (1/0): ");
            bandera = lectura.nextInt();
        }

    }
}
