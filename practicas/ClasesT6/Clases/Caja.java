package practicas.ClasesT6.Clases;

import practicas.ClasesT6.UsoClases.ColaBanco.AccionesBanco;

public class Caja {

    //Atributos
    private double saldo;
    private Cliente[] colaClientes;


    //Constructor
    public Caja()
    {
        this.saldo = 1000;
        this.colaClientes = new Cliente[0];
    }
    

    public void cogerTurno(Cliente cliente){
        Cliente nuevaCola[] = new Cliente[this.colaClientes.length + 1];

        for (int i = 0; i < this.colaClientes.length; i++) {
            nuevaCola[i] = this.colaClientes[i];
        }

        //el nuevo elemento lo ponemos en la ultima posicion del array
        nuevaCola[nuevaCola.length - 1] = cliente;

        this.colaClientes = nuevaCola;
    }


    public void atender()
    {
        //cojo al cliente que le toca
        Cliente clienteAtendido = desencolar();

        System.out.println("Atendiendo a: " + clienteAtendido.getNombre());
        //atiendo a ese cliente
            //Ingresa dinero
        if (clienteAtendido.getAccion() == AccionesBanco.INGRESAR && clienteAtendido.getImporte() > 0) {
            this.saldo += clienteAtendido.getImporte();
        }
        
            //retira dinero SI hay suficiente
        else if (clienteAtendido.getAccion() == AccionesBanco.RETIRAR && clienteAtendido.getImporte() > 0)
        {
            if (this.saldo - clienteAtendido.getImporte() >= 0) {
                this.saldo -= clienteAtendido.getImporte();
            }
            else{
                System.out.println("Error: no hay suficiente dinero para retirar, vuelva mañana");
            }
        }
    }

    /**
     * Saca un cliente del array de clientes y devuelve ese cliente
     * @return
     */
    private Cliente desencolar()
    {
        Cliente clienteAtendido = this.colaClientes[0];

        Cliente[] nuevaCola = new Cliente[this.colaClientes.length -1];

        for (int i = 0; i < nuevaCola.length; i++) {
            nuevaCola[i] = colaClientes[i+1];
        }

        this.colaClientes = nuevaCola;

        return clienteAtendido;
    }

    public void estadoCola()
    {


    }


    public double saldo()
    {
        return this.saldo;
    }


}
