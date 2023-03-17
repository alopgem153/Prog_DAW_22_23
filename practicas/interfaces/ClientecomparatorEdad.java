package practicas.interfaces;

import java.util.Comparator;

public class ClientecomparatorEdad implements Comparator<Cliente> {

    // public ClientecomparatorEdad()
    // {

    // }

    @Override
    public int compare(Cliente c1, Cliente c2) {
        
        // Cliente c1 = (Cliente)arg0;
        // Cliente c2 = (Cliente)arg1;

        return c2.getEdad() - c1.getEdad();

    }
    
}
