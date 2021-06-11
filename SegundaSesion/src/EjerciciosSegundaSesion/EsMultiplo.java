package EjerciciosSegundaSesion;

import java.util.Scanner;

//EsMultiplo.java
//determina si el segundo numero es multiplo del primero
public class EsMultiplo {

    //metodo que verifica si el segundo numero es multiplo del primero
    public static boolean esMultiplo(int primerNumero, int segundoNumero)
    {
        if (segundoNumero % primerNumero == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        //creacion del scanner
        Scanner lectura = new Scanner(System.in);

        //pregunta si desea ejecutar la aplicacion
        //flat es para determinar la continuidad de la aplicacion
        int bandera = 1;

        while (bandera == 1) {
            //Solicita y lee el primer numero
            System.out.println("Ingrese el primero numero: ");
            int primerNumero = lectura.nextInt();

            //Solicita y lee el segundo numero
            System.out.println("Ingrese el segundo numero: ");
            int segundoNumero = lectura.nextInt();

            //realizamos la verificacion de la multiplicidad del sgundo numero ingresado con respecto al primero
            if(esMultiplo(primerNumero,segundoNumero))
                System.out.printf("%d es multiplo de %d %n",segundoNumero,primerNumero);
            else
                System.out.printf("%d no es multiplo de %d %n",segundoNumero,primerNumero);

            //pregunta si desea continuar con la aplicacion
            System.out.println("Desea continuar con la aplicacion (1/0): ");
            bandera = lectura.nextInt();
        }
    }
}
