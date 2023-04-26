package clases;

import java.util.HashMap;
import java.util.Set;

public class DescuentoPorCategoria {

    HashMap<String, Integer> descuentos;

    public DescuentoPorCategoria()
    {
        descuentos = new HashMap<>();
    }

    public boolean insertar(String categoria, int descuento)
    {
        if (descuentos.containsKey(categoria))
        {
            return false;
        }
        else
        {
            descuentos.put(categoria, descuento);
            return true;
        }
    }

    public boolean modificar(String categoria, int descuento)
    {
        if (!descuentos.containsKey(categoria))
        {
            return false;
        }
        else
        {
            descuentos.put(categoria, descuento);
            return true;
        }
    }

    public boolean eliminar(String categoria)
    {
        if (!descuentos.containsKey(categoria))
        {
            return false;
        }
        else
        {
            descuentos.remove(categoria);
            return true;
        }

    }
    

    public int obtener(String categoria)
    {
        if (!descuentos.containsKey(categoria))
        {
            return 0;
        }
        else
        {
            return descuentos.get(categoria);
            
        }
    }

    public String mostrarDescuentos()
    {
        String cadena = "";

        Set<String> claves = descuentos.keySet();
        for (String categoria : claves) 
        {
            cadena += categoria + " - " + descuentos.get(categoria);
        }

        return cadena;


        //return descuentos.toString();

        return cadena;
    }
}
