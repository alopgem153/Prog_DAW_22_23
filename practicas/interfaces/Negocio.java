package practicas.interfaces;

public abstract class Negocio {

    //Atributos
    protected String nombreNegocio;
    protected double dineroEnCaja;
    protected Cliente[] colaClientes;
    protected boolean estado;

    public Negocio(String nombreNegocio)
    {
        this.nombreNegocio = nombreNegocio;
        dineroEnCaja = 0;
        colaClientes = new Cliente[0];
        estado = false;
    }

    //Metodo Asbtracto
    public abstract double PagarImpuestos();
    
    
}
