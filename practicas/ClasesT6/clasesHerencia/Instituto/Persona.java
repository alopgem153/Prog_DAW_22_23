package practicas.ClasesT6.clasesHerencia.Instituto;

public class Persona {
    
    String nombre;
    String tlf;
    String email;


    public Persona(String nombre, String tlf, String email)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        
        Persona pt = (Persona)obj;

        return this.nombre.equals(pt.nombre) 
            && this.email.equals(pt.email);

    }
}
