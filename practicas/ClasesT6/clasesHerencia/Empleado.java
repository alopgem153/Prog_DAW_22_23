package practicas.ClasesT6.clasesHerencia;

public class Empleado extends Persona 
{
    double sueldo;
    
    public Empleado(String nombre, int edad, double sueldo)
    {
        super(nombre);
        
        //super(nombre, edad);
        // this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        
        //setAltura(180);
    }


    @Override
    public String decirHola()
    {
        return " - Hola Empleado";
    }
}
