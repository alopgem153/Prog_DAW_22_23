package practicas.ClasesT6.UsoClases;

import practicas.ClasesT6.Clases.CuentaCorriente;
import practicas.ClasesT6.Clases.Gestor;
import practicas.ClasesT6.Clases.Gestor.PuestoTrabajo;

public class Banco {
    
    public static void main(String[] args) {
        
        CuentaCorriente cc_Andres = new CuentaCorriente("878787", "Andres");
        cc_Andres.ingresarDinero(1000);
        cc_Andres.sacarDinero(524);

        System.out.println(cc_Andres.mostrarInformacion());
        System.out.println(cc_Andres);

        CuentaCorriente cc_Sara = new CuentaCorriente("234234", 500);
        System.out.println(cc_Sara);

        CuentaCorriente cc_Javi = new CuentaCorriente("3453459", "Javi", 5000);
        //cc_Javi.dni = "555";
        //cc_Javi.

        Gestor luis_Gestor = new Gestor("Luis", "555-123123");
        //luis_Gestor sera Senior con 55000€ de importe maximo
        luis_Gestor.setPuesto(PuestoTrabajo.SENIOR);
        luis_Gestor.setImporteMaximo(55000);
        
        Gestor paco_Gestor = new Gestor("PACO", "666-3423", PuestoTrabajo.AYUDANTE);

        System.out.println("El puesto de Paco es: " + paco_Gestor.getPuesto() + 
                            " y su importe maximio es: " + paco_Gestor.getImporteMaximo());


        cc_Andres.setGestor(luis_Gestor);
        cc_Javi.setGestor(paco_Gestor);
        cc_Sara.setGestor(paco_Gestor);

        


    }
}
