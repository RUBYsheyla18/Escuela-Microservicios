package PrimeraSesion;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCuenta {

    public static ArrayList<Cuenta> registrarClientes() {
        //Lista de clientes(cuentas)
        ArrayList<Cuenta> clientes = new ArrayList<>();
        Scanner registra = new Scanner(System.in);
        String opcion="y";
        while(!opcion.equals("N")){
            Cuenta auxCliente = new Cuenta();
            System.out.println("Ingresa nombre");
            String nombre = registra.nextLine();
            auxCliente.setNombre(nombre);
            System.out.println("Ingresa saldo");
            int saldo = registra.nextInt();
            registra.nextLine();
            auxCliente.setSaldo(saldo);
            clientes.add(auxCliente);
            System.out.println("Ingresar nueva cuenta? [y/N]");
            opcion = registra.nextLine();
        }
        return clientes;
    }

    public static void main (String[] args)
    {
        ArrayList<Cuenta> clientes = registrarClientes();
        //creacion del escaner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar la cuenta de donde se desea retirar (Existen disponibles "
                            + clientes.size()
                            + " clientes):");
        int index = entrada.nextInt();
        index++;
        System.out.println("Ingresar el monto a retirar: ");
        int monto = entrada.nextInt();

        clientes.get(index).Retirar(monto);
    }
}

