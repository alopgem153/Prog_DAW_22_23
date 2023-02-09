package practicas.ClasesT6.Clases;

public class Terminal {

    //Atributos
    private String numero;
    private int tiempo;

    //Constructor
    public Terminal(String numero)
    {
        this.numero = numero;
        this.tiempo = 0;
        
    }

    //Metodos

    

    @Override
    public String toString()
    {
        String resultado = "Nº "+ this.numero + " - " + this.tiempo + "s de conversacion"; 
        return resultado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void llama(Terminal tdestino, int duracion )
    {
        //this.tiempo += duracion;
        this.setTiempo(this.getTiempo()+duracion);
        tdestino.setTiempo(tdestino.getTiempo()+duracion);
    }
}
