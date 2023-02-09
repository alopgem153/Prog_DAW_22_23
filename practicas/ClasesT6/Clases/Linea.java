package practicas.ClasesT6.Clases;

public class Linea {

    //Atributos
    private Punto inicio;
    private Punto fin;

    //Contructor
    public Linea(Punto inicio, Punto fin)
    {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString()
    {
        return "Línea formada por los puntos " + this.inicio 
                + " y " + this.fin; 
    }
    
}
