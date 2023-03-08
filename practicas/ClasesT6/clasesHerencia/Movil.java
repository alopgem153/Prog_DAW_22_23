package practicas.ClasesT6.clasesHerencia;

import java.text.DecimalFormat;

import practicas.ClasesT6.Clases.Terminal;

public class Movil extends Terminal {

    public enum Tarifa { RATA, MONO, BISONTE};

    //Atributos
    private Tarifa tarifa;
    private int tiempoTarificado;

    //Constructor
    public Movil(String numero, String tarifa)
    {
        super(numero);

        this.tarifa = Tarifa.valueOf(tarifa.toUpperCase());
        this.tiempoTarificado = 0;
    }

    public void llama(Movil movil, int duracion)
    {
        super.llama(movil, duracion);

        this.tiempoTarificado += duracion;
    }

    public String toString()
    {

        DecimalFormat formato = new DecimalFormat("0.00");
        return super.toString() + " - tarificados " +  
                    formato.format(totalTarificado()) + " euros (" + this.tiempoTarificado + " seg)";  
    }

    private double totalTarificado()
    {
        double total = 0;
        switch(this.tarifa)
        {
            case RATA:
                total = (this.tiempoTarificado * 0.06) / 60;
                break;
            case MONO:
                total = (this.tiempoTarificado * 0.12) / 60;
                break;
            case BISONTE:
                total = (this.tiempoTarificado * 0.3) / 60;
                break;
            default:
                
                break;
        }

        return total;
    }
    
}
