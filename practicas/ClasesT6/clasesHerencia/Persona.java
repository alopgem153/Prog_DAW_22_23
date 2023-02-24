package practicas.ClasesT6.clasesHerencia;

public class Persona {

    String nombre;
    protected int edad;
    private int altura;
    public String dni;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = 170;
    }

    public Persona(String nombre)
    {
        this.nombre = nombre;
        this.edad = 18;
        this.altura = 170;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    public String decirHola()
    {
        return "Hola persona";
    }
}
