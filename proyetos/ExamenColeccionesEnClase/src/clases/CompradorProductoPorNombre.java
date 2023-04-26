package clases;

import java.util.Comparator;

public class CompradorProductoPorNombre implements Comparator<Producto>
{

    @Override
    public int compare(Producto arg0, Producto arg1) {
        return arg0.getNombre().compareTo(arg1.getNombre());
    }
    
}
