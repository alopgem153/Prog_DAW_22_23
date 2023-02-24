package practicas.ClasesT6.clasesHerencia;

public class HoraExacta  extends Hora
{
    private int segundos;
    
    public HoraExacta(int hora, int minuto, int segundos)
    {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public boolean setSegundo(int valor)
    {
        boolean correcto = false;

        if (valor >= 0 && valor <= 59)
        {
            this.segundos = valor;
            correcto = true;
        }
        

        return correcto;
    }

    /**
     * Incrementa en un segundo;
     */
    public void inc()
    {
        if (!setSegundo(this.segundos+1))
        {
            setSegundo(0);
            super.inc();
        }
    }

    @Override
    public boolean equals(Object object)
    {

        HoraExacta horaExacta = (HoraExacta)object;

        

        return (this.segundos == horaExacta.segundos 
                && super.equals(object) );
    }


    @Override
    public String toString()
    {
        return super.toString() + ":" + this.segundos;
    }
    
}
