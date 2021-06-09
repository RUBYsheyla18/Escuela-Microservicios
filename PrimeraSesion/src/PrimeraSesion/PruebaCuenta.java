package PrimeraSesion;
import java.util.Scanner;

public class PruebaCuenta {

    public static void main (String[] args) throws java.lang.Exception
    {
        //creacion del escaner
        Scanner entrada = new Scanner(System.in);

        //creacion del objeto cuenta
        Cuenta miCuenta = new Cuenta();

        //muestra que en el objeto aun no hay datos, null
        System.out.printf("El nombre inicial es: %s %n %n", miCuenta.getNombre());

        //pide y lee el nombre
        System.out.println("Introduce el nombre de la cuenta: ");
        String elnombre = entrada.nextLine();
        miCuenta.setNombre(elnombre);
        System.out.println();

        //muestra el nombre de la cuenta
        System.out.printf("El nombre en el objeto miCuenta es: %n %s %n", miCuenta.getNombre());

        //pide y lee el saldo de la cuenta
        System.out.println("Ingrese el saldo de la cuenta: ");
        float saldo= entrada.nextFloat();

        //establece el saldo del objeto creado
        miCuenta.setSaldo(saldo);

        //pide y lee el monto a retirar
        System.out.println("Ingrese el monto a retirar: ");
        float monto= entrada.nextFloat();

        //retira el monto del saldo actual, y evalua si es posible realziar la operacion
        miCuenta.Retirar(monto);

        System.out.println("");

        //otro ejemplo de prueba usando el constructor con parametros
        Cuenta cuentaPrueba = new Cuenta ("Ruby", 1000);

        //realiza el retiro de la cuenta de prueba
        cuentaPrueba.Retirar(1500);
    }
}

