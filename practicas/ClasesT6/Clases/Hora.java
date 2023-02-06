package practicas.ClasesT6.Clases;

public class Hora {

    //Atributos
    private int horas;
    private int minutos;
    private int segundos;

    //Constructor
    public Hora(int hora)
    {
        if (hora < 0 && hora >23)
        {
            this.horas = 0;    
        }
        else
        {
            this.horas = hora;
        }
        this.minutos = 0;
        this.segundos = 0;
    }

    //Atributos
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas <= 23)
        {
            this.horas = horas;
        }
        else
        {
            setHoras(0);
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 60)
        {
            this.minutos = minutos;
        }
        else 
        {
            this.minutos = 0;
            //this.horas =  this.horas +1; No es correcto asi
            setHoras(getHoras()+1);
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 60)
        {
            this.segundos = segundos;
        }
        else 
        {
            this.segundos = 0;
            
            //this.minutos = this.minutos +1;
            setMinutos(getMinutos() + 1);
        }
    }

    @Override
    public String toString()
    {
        return getHoras() + ":" + getMinutos() + ":" + getSegundos();
    }

    

    
}
