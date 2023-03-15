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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(salarioBase);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((materia == null) ? 0 : materia.hashCode());
        result = prime * result + (esTutor ? 1231 : 1237);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Profesor other = (Profesor) obj;
        if (Double.doubleToLongBits(salarioBase) != Double.doubleToLongBits(other.salarioBase))
            return false;
        if (materia == null) {
            if (other.materia != null)
                return false;
        } else if (!materia.equals(other.materia))
            return false;
        if (esTutor != other.esTutor)
            return false;
        return true;
    }

    
}
