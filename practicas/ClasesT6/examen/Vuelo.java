package practicas.ClasesT6.examen;

public class Vuelo {

    Saltador[] arraySaltadores;
    String nombrePiloto;


    public Vuelo(String nombrePiloto)
    {
        nombrePiloto = "PEPE";

        arraySaltadores = new Saltador[0];
    }


    

    public void addSaltador(Cliente cli1, Paracaida paraca1, Paracaida paraca2)
    {
        Saltador s = new Saltador(cli1, nombrePiloto, nombrePiloto);
    

        addSaltador(s);
    }

    public void addSaltador(Saltador s)
    {

    }
    
}
