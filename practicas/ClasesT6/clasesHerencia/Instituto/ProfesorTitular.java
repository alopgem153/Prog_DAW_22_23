package practicas.ClasesT6.clasesHerencia.Instituto;

public class ProfesorTitular extends Profesor
{
    //Atributos
    private int antiguedad;

    public ProfesorTitular(String nombre, String tlf, String email, 
        double salarioBase, String materia, boolean esTutor, int antiguedad)
    {
        super(nombre, tlf, email, salarioBase, materia, esTutor);
        
        this.antiguedad = antiguedad;

    }

    @Override
    public double salario() {
        
        double total = salarioBase + 10 * this.antiguedad;
        if (this.esTutor)
        {
            total +=  30;
        }

        return total;
    }

    @Override
    public boolean equals(Object obj) {
        
        ProfesorTitular pt = (ProfesorTitular)obj;

        return super.equals(obj) && this.antiguedad == pt.antiguedad;

    }

    
    
}
