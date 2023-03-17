package practicas.interfaces;

public class Cliente implements Comparable<Cliente> {

    //Atributos
    private String nombre;
    private double dinero;
    private int edad;

    public Cliente(String nombre, double dinero)
    {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public Cliente(String nombre, double dinero, int edad)
    {
        this(nombre, dinero);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int compareTo(Cliente c)
    {
        //Ordenamos por dinero
        int resultado = 0;

        if (this.dinero>c.dinero)
        {
            resultado = 1;
        }
        else if(this.dinero < c.dinero)
        {
            resultado = -1;
        }

        return (int)(this.dinero - c.dinero); 
    }

    // @Override
    // public int compareTo(Object o) {

    //     Cliente c = (Cliente)o;
    //     //Compramos por nombre
        
    //     // int resultado = 0 ; //presuponemos que son iguales

    //     // if (this.nombre.compareTo(c.nombre) > 0)
    //     // {
    //     //     resultado = 1;
    //     // }
    //     // else if (this.nombre.compareTo(c.nombre) < 0)
    //     // {
    //     //     resultado = -1;
    //     // }

    //     // return resultado;

    //     //Ordenamos por dinero
    //     int resultado = 0;

    //     if (this.dinero>c.dinero)
    //     {
    //         resultado = 1;
    //     }
    //     else if(this.dinero < c.dinero)
    //     {
    //         resultado = -1;
    //     }

    //     return (int)(this.dinero - c.dinero); 
        
    // }

    @Override
    public String toString() {
        
        return this.nombre + "(" + this.dinero + ") " + "[" + this.edad + "]";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
}
