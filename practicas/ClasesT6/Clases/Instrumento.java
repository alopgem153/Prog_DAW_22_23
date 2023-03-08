package practicas.ClasesT6.Clases;

public  abstract class Instrumento {

    public enum Notas { DO, RE, MI, FA, SOL, LA, SI};

    //Atributos

    protected Notas[] melodia;


    //Constructor

    public Instrumento()
    {
        this.melodia = new Notas[0];
    }

    public void add(Notas nota)
    {
        Notas[] nuevaMelodia = new Notas[this.melodia.length+1];

        for (int i = 0; i < this.melodia.length; i++) 
        {
            nuevaMelodia[i] = melodia[i];    
        }

        nuevaMelodia[nuevaMelodia.length-1] = nota;

        this.melodia = nuevaMelodia;

        
    }


    public abstract void interpretar();
    
}
