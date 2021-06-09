package PrimeraSesion;

import java.util.Scanner;

public class PruebaFecha {
    public static boolean verificarFecha(int dia, int mes, int año)
    {
        //verifica la valides de la fecha ingresada

        //se evalua segun al mes, la cantidad de dias ingresados
        switch (mes)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                return dia <= 31 && dia >= 1;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            {
                return dia <= 30 && dia >= 1;
            }

            case 2:
            {
                //en el caso de ser el mes de febrero, se avlua si es año
                //bisisesto para determinar el limite de los dias
                if(año % 4 == 0)
                {
                    return dia <= 29 && dia >= 1;
                }

                else
                {
                    return dia <= 28 && dia >= 1;
                }
            }

            default:
                return false;

        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        //creacion del escaner
        Scanner entrada = new Scanner(System.in);

        //pide y lee los datos, dia, mes y año
        System.out.println("Ingrese dia: ");
        int dia = entrada.nextInt();

        System.out.println("Ingrese mes: ");
        int mes = entrada.nextInt();

        System.out.println("Ingrese año: ");
        int año = entrada.nextInt();

        //se usa el metodo para verificar la fecha y de estar bien, se crea el objeto
        //caso contrario se manda mensaje de error de que la fecha es invalida
        if (verificarFecha(dia,mes,año))
        {
            Fecha fecha  = new Fecha(dia,mes,año);
            fecha.mostrarFecha();
        }
        else
            System.out.println("Fecha ingresada es invalida");

    }
}
