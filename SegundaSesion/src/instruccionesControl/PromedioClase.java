package instruccionesControl;

//obetener el promedio de la clase mediante la repetecion controlado por contador

import java.util.Scanner;

public class PromedioClase {
    public static void main(String[] args) {
        //creacion del Scanner
        Scanner entrada = new Scanner(System.in);

        //fase de inicializacion
        int total = 0; // variable de la suma de las calificaciones introducidas mediante el teclado
        int contadorCalificaciones = 1; //variable que contendra el numero de calificaciones

        //fase de procesamiento usa de la repeticion controlada poor contador
        while(contadorCalificaciones <= 10)
        {
            System.out.printf("Escribe la calificacion [%d]: ",contadorCalificaciones); //solicita datos
            int calificacion = entrada.nextInt(); //recibe la calificacion

            //verifica que la calificacion este entre el rango de 0 a 20
            while (calificacion >20 || calificacion < 0) {
                System.out.println("Ingrese una calificacion de 0 a 20"); //mensaje de error
                System.out.printf("Escribe la calificacion [%d]: ",contadorCalificaciones); //solicita datos
                calificacion = entrada.nextInt(); //recibe la calificacion
            }

            total = total + calificacion; //sumar la calificacion al total
            contadorCalificaciones = contadorCalificaciones + 1;
        }

        int promedio = total / (contadorCalificaciones - 1); // la division para obtner el promedio de las calificaciones

        //fase de mostrar resultados
        System.out.printf("%nEl total de las calificaciones es: %d %n",total);
        System.out.printf("%nEl promedio de las calificaciones es: %d %n",promedio);

    }
}
