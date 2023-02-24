package practicas.ClasesT6.clasesHerencia;

public class Hora {

    private int hora;
    private int minuto;

    public Hora(int hora, int minuto)
    {
        if (hora<0 && hora>23 && minuto<0 && minuto > 60)
        {
            this.hora = 0;
            this.minuto = 0;    
        }
        else
        {
            this.hora = hora;
            this.minuto = minuto;
        }
    }  
    
    /**
     * Incrementa un minuto la hora actual
     */
    public void inc()
    {
        if (setMinutos(this.minuto+1))
        {
            //si es valido entonce no tengo que hacer nada
        }
        else 
        {
            setMinutos(0);
            if(!setHora(this.hora+1))
            {
                setHora(0);
            }
        }
    }


    public boolean setMinutos(int valor)
    {
        boolean correcto = false;

        if (valor >= 0 && valor <= 59)
        {
            this.minuto = valor;
            correcto = true;
        }
        else
        {
            correcto = false;
        }

        return correcto;
    }

    public boolean setHora(int valor)
    {
        
        boolean correcto = false;

        if (valor >= 0 && valor <= 23)
        {
            this.hora = valor;
            correcto = true;
        }
        else
        {
            correcto = false;
        }

        return correcto;

    }

    @Override
    public String toString()
    {
        return this.hora + ":" + this.minuto;
    }


    @Override
    public boolean equals(Object object)
    {

        Hora hora = (Hora)object;

        return (this.hora == hora.hora  
                && this.minuto == hora.minuto );
    }
}
