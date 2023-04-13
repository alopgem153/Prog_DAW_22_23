package practicas.ClasesT6.clasesHerencia.Instituto;

public class UsoInstituto {

    public static void main(String[] args) {
        

        Persona[] asistentes = new Persona[0];

        //Profesor p = new Profesor("PEPE",)
        ProfesorTitular pT1 = new ProfesorTitular("PEPE", "555123", "@.com", 1000, "Latin", false, 2);

        ProfesorTitular pT2 = new ProfesorTitular("PEPE", "555123", "@.com", 1000, "Latin", false, 3);

        if(asistentes[0] instanceof ProfesorTitular)
        {
            System.out.println("Es un profesor titular");
        }
        else 
        {
            System.out.println("No es");
        }

        asistentes[0].getClass().getSimpleName();



        System.out.println(pT1.equals(pT2));

    }
    
}
