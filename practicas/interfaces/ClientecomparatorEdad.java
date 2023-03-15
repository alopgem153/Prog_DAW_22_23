package practicas.interfaces;

import java.util.Comparator;

public class ClientecomparatorEdad implements Comparator {

    // public ClientecomparatorEdad()
    // {

    // }

    @Override
    public int compare(Object arg0, Object arg1) {
        
        Cliente c1 = (Cliente)arg0;
        Cliente c2 = (Cliente)arg1;

        return c2.getEdad() - c1.getEdad();

    }
    
}
