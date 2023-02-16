package practicas.ClasesT6.Clases;

public class Carta {

    public enum Palo {ORO, BASTOS, ESPADAS, COPAS};

    //Atributos
    private Palo palo;
    private int numero;

    //Constructor
    public Carta (Palo palo, int numero)
    {
        this.palo = palo;
        this.numero = numero;
    }

    //Metodos
    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Devuelve true si la carta que hace
     *  la llamada es menor a la carta que se pasa como parametro
     * @param carta
     * @return
     */
    public boolean esMenor(Carta carta)
    {
        boolean resultado = false;
        if (this.numero < carta.getNumero())
        {
            resultado = true;
        }

        return resultado;
    }

    @Override
    public String toString()
    {
        return this.numero + " de " + this.palo;
    }
    
    
}
