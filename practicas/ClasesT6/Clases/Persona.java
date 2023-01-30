package ClasesT6.Clases;

class Persona {

    //Atributos de la clase
    String nombre;
    String apellidos;
    int edad;
    int estatura;
    String dni;

    //Constructores
    public Persona()
    {
        this.nombre = "Desconocido";
    }

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    

    public Persona(String nombre, String apellidos, int edad, int estatura, String dni )
    {

    }

    //Métodos

    void saludar()
    {
        System.out.println("Hola soy " + nombre);
    }

    void cumplirAños()
    {
        edad = edad + 1; 
        //edad++;
    }

    String cambiarNombre(String nombre)
    {
        this.nombre = nombre;
        return this.nombre;
    }

    void CopiarPersona(Persona p1)
    {
        this.nombre = cambiarNombre(p1.nombre);
        this.edad = p1.edad;
        
    }

    static String QueDiaEs()
    {
        String resultado = "Lunes";
        return resultado;
    }
    
}
