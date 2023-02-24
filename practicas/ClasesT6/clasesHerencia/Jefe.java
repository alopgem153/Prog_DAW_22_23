package practicas.ClasesT6.clasesHerencia;

public class Jefe  extends Empleado
{
    private String departamento;
    private double prima;

    public Jefe(String nombre, int edad, double sueldo, String departamento)
    {
        super(nombre, edad, sueldo);
        this.departamento = departamento;
        this.prima = 1000;

    }

    @Override
    public String decirHola()
    {
        return super.decirHola() + " - Soy un jefe y no digo hola ";
    }
}
