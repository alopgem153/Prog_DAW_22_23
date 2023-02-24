package practicas.ClasesT6.clasesHerencia;

public class EjemploUsoHerencia {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("ALFONSO");

        Empleado emp1 = new Empleado("Maria", 19, 2000);

        System.out.println(p1.decirHola());
        System.out.println(emp1.decirHola());


        Persona p2 = emp1;
        Persona p3 = emp1;
        //System.out.println(p2.decirHola());
        //System.out.println(p1.decirHola()  + p1.getClass());

        Jefe jefe1 = new Jefe("NOMBRE-Jefe", 55, 5000, "Ventas");

        System.out.println("---------------------");
        Persona[] elementos = { p1, emp1, p2, p3, jefe1};
        for (Persona persona : elementos) {
            System.out.println(persona.decirHola() + " - " + persona.getClass().getName());
        }


    }
    
}
