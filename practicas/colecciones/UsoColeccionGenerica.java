package practicas.colecciones;

import practicas.ClasesT6.Clases.Cliente;
import practicas.interfaces.Perro;

public class UsoColeccionGenerica {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("KIKE", null, 1000);

        Perro perro = new Perro("ROKO", "Chucho");

        ColeccionGenerica<Cliente> coleccionCliente = new ColeccionGenerica<Cliente>();
        //ColeccionGenerica<Cliente> coleccionCliente = new ColeccionGenerica<>();

        coleccionCliente.insertar(cliente);

        ColeccionGenerica<Perro> coleccionPerro = new ColeccionGenerica<Perro>();

        coleccionPerro.insertar(perro); 
        
        ColeccionGenerica<Integer> coleccionNumero = new ColeccionGenerica<Integer>();


    }
    
}
