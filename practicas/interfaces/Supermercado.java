package practicas.interfaces;

import java.util.Arrays;

public class Supermercado extends Negocio implements Tienda_I {
    
    //Atributo
    String nombreMarcaBlanca;

    public Supermercado(String nombre, String nombreMarcaBlanca, double dineroEnCaja)
    {
        super(nombre);
        this.nombreMarcaBlanca = nombreMarcaBlanca;
        this.dineroEnCaja = dineroEnCaja;
    }

    //Metodo abstracto de Negocio
    public double PagarImpuestos()
    {
        return dineroEnCaja * 0.10;
    }

    @Override
    public void abrir() {
        this.estado = true;
        
    }

    
    @Override
    public Cliente cobrar() {
        if(colaClientes.length > 0)
        {
            //Atendemos al primero de la cola
            Cliente clienteAtendido = colaClientes[0];

            //Quitamos el primer cliente de la cola
            Cliente[] nuevacola = new Cliente[this.colaClientes.length-1];
            for (int i = 0; i < nuevacola.length; i++) 
            {
                nuevacola[i] = colaClientes[i+1];    
            }
            this.colaClientes = nuevacola;

            return clienteAtendido;
        }
        else
        {
            //no hay clientes en cola
            return null;
        }
    }

    @Override
    public void nuevoCliente(Cliente cliente) {
        //Inserto el el array de clientes
        Cliente[] nuevaCola = new Cliente[this.colaClientes.length+1];

        for (int i = 0; i < this.colaClientes.length; i++) {

            nuevaCola[i] = this.colaClientes[i];
            

        }

        nuevaCola[nuevaCola.length-1] = cliente;

        this.colaClientes = nuevaCola;
        
    }

    

    



}
