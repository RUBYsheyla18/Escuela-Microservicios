package EjerciciosSegundaSesion;
//TableroDamas.java
//imprime un tablero de damas de 8 x 8
public class TableroDamas {
    public static void main(String[] args) {
        //se inicializa el valor del numero de linea, dado que esta variable
        //indicara si la linea sera par o impar para cambiar el patron de impresion de la cadena de texto
        int numeroLinea = 0;

        //mediante un ciclo for, se repetira 8 veces para poder imprimir las 8 filas del tablero
        for(int i= 0; i< 8; i++){
            //se verifica si numeroLinea es par o impar para poder imprimir el patron del tablero
            if(numeroLinea%2 == 0){
                //en caso sea par, se empezara por imprimir * 8 veces
                for(int j = 0; j<8; j++){
                    System.out.print("* ");
                }
                //se incrementa el numero de linea
                numeroLinea++;
            }else{
                //en caso sea impar, se imprimira primero un espacio de linea
                //luego seguido por 8 *'s
                System.out.print(" ");
                for(int j = 0; j<8; j++){
                    System.out.print("* ");
                }
                //se incrementa el numero de linea
                numeroLinea++;
            }
            //se realiza el salto de linea para imprimir la sgt linea
            System.out.println();
        }
    }
}
