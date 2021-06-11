package EjerciciosSegundaSesion;

//PuntosCalidad.java
// Recibe como entrada el promedio de un estudiante entre 0 y 100, segun a los valores devuelve el
// punto de calidad
// devuelva 4 si el promedio se encuentra entre 90 y 100
// 3 si el promedio se encuentra entre 80 y 89
// 2 si el promedio se encuentra entre 70 y 79
// 1 si el promedio se encuentra entre 60 y 69
// 0 si el promedio es menor que 60.


import java.util.Scanner;

public class PuntosCalidad {

    //metodo que devuelve el punto de calidad segun el valor del promedio del alumno
    public static int puntosCalidad(int promedio){
        if (promedio <= 100 && promedio >= 90)
            return 4;
        else if (promedio <= 89 && promedio >= 80)
            return 3;
        else if (promedio <= 79 && promedio >= 70)
            return 2;
        else if (promedio <= 69 && promedio >= 60)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        //creacion del scanner
        Scanner lectura = new Scanner(System.in);

        //pregunta si desea ejecutar la aplicacion
        //flat es para determinar la continuidad de la aplicacion
        int bandera = 1;

        while (bandera == 1){
            //pide y lee el valor del promedio del alumno
            System.out.println("Ingrese promedio del alumno: ");

            int promedio = lectura.nextInt();

            //verifica que el valor del promedio este entre 0 y 100
            while (promedio < 0 || promedio > 100) {
                System.out.println("Promedio ingresado incorrecto, debe de ser entre 0 y 100");
                System.out.println("Ingrese promedio del alumno: ");
                promedio = lectura.nextInt();
            }

            //realiza la verificacion del punto de calidad segun al promedio
            System.out.printf("El punto de calidad para el promedio %d es %d %n",promedio,puntosCalidad(promedio));

            //pregunta si desea continuar con la aplicacion
            System.out.println("Desea continuar con la aplicacion (1/0): ");
            bandera = lectura.nextInt();
        }

    }

}


