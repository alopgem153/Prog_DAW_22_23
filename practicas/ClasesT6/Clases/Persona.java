package practicas.ClasesT6.Clases;

public class Persona {

    //Atributos de la clase
    private String nombre;
    private String apellidos;
    private int edad;
    public int estatura;
    private String dni;
    private CuentaCorriente cc;

    static boolean vivo = true;

    

//----------------------------------

   
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

    public Persona(String nombre, String apellidos)
    {

    }

    // public Persona(String nombre, int estatura)
    // {

    // }
    

    public Persona(String nombre, String apellidos, int edad, int estatura, String dni )
    {
        // this.nombre = nombre;
        // this.edad = edad;
        this(nombre, edad);
        

        this.apellidos = apellidos;
        this.estatura = estatura;
        this.dni = dni;
        
    }

    //Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CuentaCorriente getCc() {
        return cc;
    }

    public void setCc(CuentaCorriente cc) {
        this.cc = cc;
    }

    public static boolean isVivo() {
        return vivo;
    }

    public static void setVivo(boolean vivo) {
        Persona.vivo = vivo;
    }


    public void saludar()
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

    static void matarATodos()
    {
        vivo = false;
        
    }

    public void crearCuentaCorriente()
    {
        CuentaCorriente cc = new CuentaCorriente("00000", this.nombre);
        this.cc = cc;
        

    }
    
}
