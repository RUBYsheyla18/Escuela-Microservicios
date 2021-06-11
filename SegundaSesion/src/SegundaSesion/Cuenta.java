package SegundaSesion;

//clase cuenta con un sconstructor qe inicializa la variable instancia nombre
public class Cuenta {
    private String nombre;

    //constructor de la clase, inicializa enombre con el parametro nombre
    public Cuenta(String nombre)
    {
        this.nombre = nombre;
    }
    public Cuenta(){}

    //metodo para establecer el nombre d
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //metodo para obtener el nombre
    public String getNombre(){
        return nombre;
    }
}
