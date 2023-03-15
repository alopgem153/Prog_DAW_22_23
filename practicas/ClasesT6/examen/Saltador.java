package practicas.ClasesT6.examen;

public class Saltador extends Cliente 
{
    String paracaida1;
    String paracaida2;
    
    public Saltador(String nombre, String ape, int altura, String p1, String p2)
    {
        super(nombre, ape,altura);
        this.paracaida1 = p1;
        this.paracaida2 = p2;
    }

    public Saltador(Cliente cli, String p1, String p2)
    {
        super(cli.nombre, cli.apellidos, cli.altura);
        this.paracaida1 = p1;
        this.paracaida2 = p2;
    }
}
