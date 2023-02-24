package practicas.ClasesT6.Clases;

public class Incidencia {
    public enum EstadoIndicencia {PENDIENTE, RESUELTA, EN_PROCESO, CERRADO}

    //Articulo
    private int codigo;
    private EstadoIndicencia estado;
    private String descripcionFallo;
    private int puesto;
    private String solucion;
    
    private static int numeroIncidenciasTotales;
    private static int incidenciasPendientes;

    //Constructor
    public Incidencia (int puesto, String descripcionError)
    {
        this.descripcionFallo = descripcionError;
        this.puesto = puesto;

        this.estado = EstadoIndicencia.PENDIENTE;

        numeroIncidenciasTotales++;
        incidenciasPendientes++;
        this.codigo = numeroIncidenciasTotales;
    }


    //Metodos
    public void resuelve(String descripcionSolucion)
    {
        this.solucion = descripcionSolucion;
        this.estado = EstadoIndicencia.RESUELTA;
        //setEstado("Resuelto");
        incidenciasPendientes--;
    }

    public void cerrarIncidencia()
    {
        this.estado = EstadoIndicencia.CERRADO;
    }

    public static int getPendientes()
    {
        return incidenciasPendientes;
    }

    public void setEstado(EstadoIndicencia estado)
    {
        this.estado = estado;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        resultado = "Incidencia " + this.codigo + 
                " - Puesto " + this.puesto + " - " + this.descripcionFallo + 
                " -" + this.estado +
                (this.estado == EstadoIndicencia.RESUELTA? this.solucion: "");

        return resultado;
    }
    
}
