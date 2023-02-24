package practicas.ClasesT6.Clases;

import practicas.ClasesT6.UsoClases.ColaBanco.AccionesBanco;

public class Cliente {

    private String nombre;
    private AccionesBanco accion;
    private double importe;
    
    public Cliente(String nombre, AccionesBanco accion, double importe)
    {
        this.nombre = nombre;
        this.accion = accion;
        this.importe = importe;
    }


    @Override
    public String toString()
    {
        return  this.nombre + " " + this.accion + "("+ this.importe +")";
    }


    public String getNombre() {
        return nombre;
    }


    public AccionesBanco getAccion() {
        return accion;
    }


    public double getImporte() {
        return importe;
    }

    
    
}
