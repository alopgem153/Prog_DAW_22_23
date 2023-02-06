package practicas.ClasesT6.Clases;

public class DentroDeClases {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();

        System.out.println("Edad persona1: " + persona1.edad);
        System.out.println("Nombre persona1: " + persona1.nombre);

        persona1.nombre = "Alfonso";
        persona1.edad = 100;
        System.out.println("Nombre persona1: " + persona1.nombre);


        Persona persona2 = new Persona();
        persona2.nombre = "Javi";
        persona2.estatura = 175;
        persona2.edad = persona1.edad;
        
        System.out.println("Edad persona2: " + persona2.edad);
        System.out.println("Nombre persona2: " + persona2.nombre);
        
        System.out.println("------------------");

        System.out.println(persona2.toString());

        System.out.println("------------------");
        System.out.println("Edad Persona1:" +persona1.edad);
        persona1.cumplirAños();
        System.out.println("Edad Persona1:" +persona1.edad);

        persona1.cambiarNombre("juan");

        Persona p3 = new Persona();

        p3.CopiarPersona(persona2);

        String comoEstaP3 = p3.QueDiaEs();

        String comoEstanLasPersonas = Persona.QueDiaEs();

        System.out.println("------------------");

        Persona p4 = new Persona("Andres", 15);

        Persona p5 = new Persona();

        Persona p6 = new Persona("Pepe", null, 0, 0, "35690835");

        // System.out.println(p6.vivo);
        // System.out.println(Persona.vivo);
        // Persona.matarATodos();
        // System.out.println(p6.vivo);
        // System.out.println(Persona.vivo);

        if (p5.dni != null)
        {
            System.out.println("Nombre de p5: "+ p5.dni);
        }
        else
        {
            System.out.println("Aún no tiene DNI");
        }


        persona1.crearCuentaCorriente();
        CuentaCorriente cc_alfonso = persona1.cc;
        System.out.println(cc_alfonso);
        //cc_alfonso.saldo = 20;
        persona1.cc.saldo = 20;

        double saldoActual = cc_alfonso.saldo;

        cc_alfonso.ingresarDinero(20);
        System.out.println(cc_alfonso);
    }
    
}
