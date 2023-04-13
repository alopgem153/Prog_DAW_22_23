package practicas.colecciones.ejer17_18;

import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {

    //Atributos
    //ArrayList<Elemento> carrito;

    HashSet<Elemento> carrito;

    //constructor
    public Carrito()
    {
        //carrito = new ArrayList<Elemento>();
        carrito = new HashSet<Elemento>();
    }

    public void agrega(Elemento elem)
    {
        if(!carrito.contains(elem))
        {
            carrito.add(elem);

        }
        else
        {
            for (Elemento elemento : carrito) 
            {
                if(elemento.equals(elem))
                {
                    elemento.setCantidad(elemento.getCantidad() + elem.getCantidad());
                }    
            }

        }

        
    }

    public int numeroDeElementos()
    {
        return carrito.size();
    }

    public int cantidadTotalElementos()
    {
        int total = 0;

        for (Elemento elemento : carrito) 
        {
            int cantidad = elemento.getCantidad();
            total += cantidad;    
        }

        return total;
    }

    public double importeTotal()
    {
        double total = 0;

        for (Elemento elemento : carrito) 
        {
            int cantidad = elemento.getCantidad();
            double precio = elemento.getPrecio();
            total += cantidad*precio;    
        }

        return total;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Elemento elem : carrito) {
            resultado += elem.toString() + " \n";
        }
        return resultado;
    }
    
}
