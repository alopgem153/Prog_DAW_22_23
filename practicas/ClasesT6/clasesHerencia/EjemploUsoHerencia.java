package practicas.ClasesT6.clasesHerencia;

public class EjemploUsoHerencia {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("ALFONSO");

        Empleado emp1 = new Empleado("Maria", 19, 2000);

        //System.out.println(p1.decirHola());
        //System.out.println(emp1.decirHola());


        //p1 = emp1;
        //System.out.println(p1.decirHola()  + p1.getClass());


        Persona[] elementos = { p1, emp1};
        for (Persona persona : elementos) {
            System.out.println(persona.decirHola());
        }


    }
    
}
