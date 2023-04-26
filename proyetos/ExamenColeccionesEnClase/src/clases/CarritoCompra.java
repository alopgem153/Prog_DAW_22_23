package clases;

import java.util.ArrayList;
import java.util.Collections;

public class CarritoCompra {

    ArrayList<Producto> productos;


    public CarritoCompra()
    {
        productos = new ArrayList<>();
    }

    public boolean insertar(Producto p)
    {
        return productos.add(p);
    }

    public boolean eliminar(int idProducto)
    {
        boolean borrada = false;

        for (Producto elemento : productos) 
        {
            if (elemento.getId() == idProducto && borrada == false)
            {
                productos.remove(elemento);
                borrada = true;
            }    
        }

        return borrada;
    }

    public void limpiarCarrito()
    {
        productos.clear();
        
    }

    public String mostrarPorCodigo()
    {

        Collections.sort(productos);
        return productos.toString();
        //return mostraProductos();
    }


    public String mostrarPorNombre()
    {
        Collections.sort(productos, new CompradorProductoPorNombre());
        return productos.toString();
    }


    
    
}
