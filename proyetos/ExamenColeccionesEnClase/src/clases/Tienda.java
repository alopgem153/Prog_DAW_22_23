package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Tienda implements Tienda_I {


    private List<Producto> almacen;
    private CarritoCompra carrito;
    private DescuentoPorCategoria descuentoPorCategoria;

    public Tienda()
    {
        almacen = new ArrayList<>();
        carrito = new CarritoCompra();
        descuentoPorCategoria = new DescuentoPorCategoria();
    }

    

    @Override
    public boolean insertarProductoAlmacen(Producto producto) {
        
        if (!almacen.contains(producto))
        {
            return almacen.add(producto);
        }
        else
        {
            System.out.println("Producto " + producto.getNombre() + " ya esta en el almacen");
            return false;
        }
    }

    @Override
    public String mostrarProductosAlmacenPorNombre() {
       Collections.sort(almacen, new CompradorProductoPorNombre());
       return almacen.toString();
    }

    @Override
    public String mostrarProductosAlmacenPorId() {
        Collections.sort(almacen);
        return almacen.toString();
    }

    @Override
    public Producto buscarProductoAlmacen(int id) {
        Producto productoBuscado = null;

        for (Producto producto : almacen) {
            if (producto.getId() == id)
            {
                productoBuscado = producto;
                
            }
        }

        return productoBuscado;
    }

    @Override
    public double obtenerCuentaTotal() {
       

        HashMap<String, Integer> descuentosUtilizadosEnCarrito = new HashMap<>();
        int totalSinDescuento = 0;
        for (Producto producto : carrito.productos) 
        {
            totalSinDescuento += producto.getPrecio();   


            if (!descuentosUtilizadosEnCarrito.containsKey(producto.getCategoria()))
            {
                descuentosUtilizadosEnCarrito.put(producto.getCategoria(), descuentoPorCategoria.obtener(producto.getCategoria()));
            }
        }

        System.out.println("Total sin descuento= " + totalSinDescuento);


        int porcentajeTotalDescuento = 0;
        for (Integer porcentaje : descuentosUtilizadosEnCarrito.values()) 
        {
            porcentajeTotalDescuento += porcentaje;    
        }


        int totalConDescuento = totalSinDescuento 
            - (totalSinDescuento * (porcentajeTotalDescuento/100));


        return totalConDescuento;
    }



    public CarritoCompra getCarrito() {
        return carrito;
    }



    public DescuentoPorCategoria getDescuentoPorCategoria() {
        return descuentoPorCategoria;
    }


    
    
}
