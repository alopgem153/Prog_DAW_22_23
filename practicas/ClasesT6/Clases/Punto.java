package practicas.ClasesT6.Clases;

public class Punto {
    //Atributos
    private double x;
    private double y;

    //Cnstructor
    public Punto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "(" + this.x + ", "+ this.y + ")";
    }
}
