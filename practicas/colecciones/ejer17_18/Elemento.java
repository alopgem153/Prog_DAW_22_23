package practicas.colecciones.ejer17_18;

import java.text.DecimalFormat;

public class Elemento {

    private String producto;
    private double precio;
    private int cantidad;


    public Elemento(String producto, double precio, int cantidad)
    {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    public String getProducto() {
        return producto;
    }


    public double getPrecio() {
        return precio;
    }


    public int getCantidad() {
        return cantidad;
    }

    

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###");
        
        return this.producto + " PVP: " + this.precio + " Unidades: " + this.cantidad + " SubTotal: " + df.format(this.precio*this.cantidad);
    }

    @Override
    public boolean equals(Object obj) {
        // dos elementos son iguales si tienen el mismo nombre y mismo precio
        Elemento elem = (Elemento)obj;
        return this.producto.equals(elem.getProducto()) 
            && this.precio == elem.getPrecio();
    }

    @Override
    public int hashCode() {
        return 0;
    }
    
}
