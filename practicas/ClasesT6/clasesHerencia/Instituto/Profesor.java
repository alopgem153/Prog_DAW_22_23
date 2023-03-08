package practicas.ClasesT6.clasesHerencia.Instituto;

public abstract class Profesor extends Persona{
    

    //Atributos
    protected double salarioBase;
    protected String materia;
    protected boolean esTutor;

    public Profesor(String nombre, String tlf, String email, 
            double salarioBase, String materia, boolean esTutor) 
    {
        super(nombre, tlf, email);
        this.salarioBase = salarioBase;
        this.materia = materia;
        this.esTutor = esTutor;
        
    }


    public abstract double salario();
}
