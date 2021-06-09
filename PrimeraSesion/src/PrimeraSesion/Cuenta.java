package PrimeraSesion;

public class Cuenta {

    //atributos
    String nombre;
    float saldo;


    //constructores
    public Cuenta (String nombre, float saldo)
    {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Cuenta (){}

    //metodos de los atributos

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }


    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public float getSaldo()
    {
        return saldo;
    }

    //metodo que realiza el retiro de dinero de la cuenta
    public void Retirar(float monto)
    {
        //verificar que monto no exceda del saldo
        if(monto > saldo)
            System.out.println("Lamentablemente el monto a retirar excede el saldo de la cuenta");

        else
        {
            //caso contrario efectuar el retiro
            setSaldo(saldo-monto);
            System.out.println("La operación se realizó con exito");
            System.out.println("Su saldo actual es de: " + getSaldo());
        }
    }

}
