package PrimeraSesion;

public class Fecha {

    // Atributos
    public int mes;
    public int dia;
    public int año;

    //constructor

    public Fecha(int dia, int mes, int año)	{
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // metodos de atributos

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getMes()
    {
        return mes;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getDia()
    {
        return dia;
    }

    public void setAño(int año)
    {
        this.año = año;
    }

    public int getAño()
    {
        return año;
    }

    // metodos de la clase

    public void mostrarFecha()
    {
        System.out.println("La fecha es: " + getMes() + " / " + getDia() + " / " + getAño());
    }

    /*public String mostrarFecha()
    {
        return "La fecha es: " + getMes() + " / " + getDia() + " / " + getAño());
    }*/

}
