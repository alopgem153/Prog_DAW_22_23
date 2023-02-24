package practicas.ClasesT6.UsoClases;

import practicas.ClasesT6.Clases.Caja;
import practicas.ClasesT6.Clases.Cliente;

public class ColaBanco {
    
    public enum AccionesBanco { RETIRAR, INGRESAR};

    public static void main(String[] args) {
      
        

        Caja caja = new Caja();
        //Cliente[] colaClientes = new Cliente[0];
        Cliente cliente1 = new Cliente("Andres", AccionesBanco.RETIRAR, 100);
        caja.cogerTurno(cliente1);
        Cliente cliente2 = new Cliente("Javier", AccionesBanco.RETIRAR, 540.5);
        caja.cogerTurno(cliente2);
        Cliente cliente3 = new Cliente("Sara", AccionesBanco.RETIRAR, 1500);
        caja.cogerTurno(cliente3);
 
 
        caja.estadoCola();
        caja.atender(); //atendemos a Andres
        System.out.println(caja.saldo());
        
        Cliente cliente4 = new Cliente("Miguel", AccionesBanco.INGRESAR, 2000);
        caja.cogerTurno(cliente4);
        caja.atender(); //Atendemos a Javier
        System.out.println(caja.saldo());
        caja.estadoCola();

        caja.atender(); //Atendemos a Sara
        System.out.println(caja.saldo());
        caja.atender(); //Atendemos a Miguel
        System.out.println(caja.saldo());
 
 
    }
 

}
