package practicas.interfaces;

import java.util.Arrays;

public class UsoInterfaz {

    public static void main(String[] args) {
        

        // Perro perro1 = new Perro("Roko", "Labrador");

        // perro1.voz();

        // perro1.vozDurmiendo();

        // Sonido_I.bostezo();

        Cliente c1 = new Cliente("PEPE", 100, 55);
        Cliente c2 = new Cliente("Maria", 25, 35);
        Cliente c3 = new Cliente("Juan", 75, 71);
        Cliente c4 = new Cliente("Roberto", 25, 18);
        Cliente c5 = new Cliente("Manolo", 150, 21);
        Cliente c6 = new Cliente("Alfonso", 10, 41) ;

        c1.compareTo(c4);

        ClientecomparatorEdad comparatorEdad = new ClientecomparatorEdad();
        comparatorEdad.compare(c2, c5);

        Supermercado mercadona = new Supermercado("merca", "Hacendado", 1000);

        mercadona.nuevoCliente(c1);
        mercadona.nuevoCliente(c2);
        mercadona.nuevoCliente(c3);
        mercadona.nuevoCliente(c4);
        mercadona.nuevoCliente(c5);
        mercadona.nuevoCliente(c6);

        System.out.println(Arrays.toString(mercadona.colaClientes));

        Arrays.sort(mercadona.colaClientes);

        System.out.println(Arrays.toString(mercadona.colaClientes));

        //Arrays.sort(mercadona.colaClientes, new ClientecomparatorEdad());
        ClientecomparatorEdad comparadorPorEdad = new ClientecomparatorEdad();
        Arrays.sort(mercadona.colaClientes,comparadorPorEdad);

        System.out.println(Arrays.toString(mercadona.colaClientes));

        Arrays.sort(mercadona.colaClientes, new ClienteOrdenaDineroEdad());

        System.out.println(Arrays.toString(mercadona.colaClientes));
        

    }
    
}
