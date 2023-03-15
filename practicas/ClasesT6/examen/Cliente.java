package practicas.ClasesT6.examen;

public class Cliente extends Persona{

    int altura;

    public Cliente(String nombre, String ape, int altura)
    {
        this.nombre = nombre;
        this.apellidos = ape;
        
        this.altura = altura;
    }

    @Override
    public String informacion() {
        return "Cliente......";
    }

    
    
}
