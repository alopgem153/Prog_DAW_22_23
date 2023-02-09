package practicas.ClasesT6.Clases;

public class FichaDomino {

    //Atributos
    private int ladoIzq;
    private int ladoDer;

    //Constructor
    public FichaDomino(int ladoIzq, int ladoDer)
    {
        if (ladoDer>=0 && ladoDer <=6 && ladoIzq>=0 && ladoIzq <=6)
        {
            this.ladoDer = ladoDer;
            this.ladoIzq = ladoIzq;
        }
    }

    //Metodos
    public FichaDomino voltea()
    {
        int auxiliar = this.ladoDer;
        this.ladoDer = this.ladoIzq;
        this.ladoIzq = auxiliar;    
        return this;
    }

    public boolean encaja(FichaDomino f)
    {
        boolean resultado = false;

        if (this.ladoIzq == f.ladoIzq || this.ladoIzq == f.ladoDer 
            || this.ladoDer == f.ladoIzq || this.ladoDer == f.ladoDer)
            {
                resultado = true;
            }

        return resultado;
    }

    @Override
    public String toString()
    {
        return "[" + (this.ladoIzq == 0 ? " ": this.ladoIzq) + "|" +
        (this.ladoDer == 0 ? " ": this.ladoDer) + "]";
    }
    
}
