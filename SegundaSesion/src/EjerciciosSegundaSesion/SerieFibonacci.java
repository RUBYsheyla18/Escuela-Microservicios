package EjerciciosSegundaSesion;

import java.util.Scanner;

public class SerieFibonacci {
    public static int nesimoFibonacci(int nesimo){
        //creacion de un arreglo para facilitar el calculo de la serie de fibonacci
        int[] fibonacci = new int[nesimo];

        //inicializacion de los primeros valores de la serie de fibanacci
        fibonacci[0]=0;
        fibonacci[1]=1;

        //calculo del n-esimo numero de la serie de fibonacci
        for(int i = 2;i<fibonacci.length;i++)
        {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }

        return fibonacci[fibonacci.length];

    }

    public static void main(String[] args) {
        //creacion del scanner
        Scanner lectura = new Scanner(System.in);

        //pregunta si desea ejecutar la aplicacion
        //flat es para determinar la continuidad de la aplicacion
        int bandera = 1;

        while (bandera == 1) {
            //Solicita y lee el numero para determinar el n-esimo numero de la serie de fibonacci
            System.out.println("Ingrese el numero: ");
            int nesimo = lectura.nextInt();

            //realizamos el calculo del n-esimo numero de la serie de fibonacci en base al numero ingresado
            System.out.printf("El n-esimo numero de la serie de Fibonacci es: %n%d%n",nesimoFibonacci(nesimo));

            //pregunta si desea continuar con la aplicacion
            System.out.println("Desea continuar con la aplicacion (1/0): ");
            bandera = lectura.nextInt();
        }
    }

}
