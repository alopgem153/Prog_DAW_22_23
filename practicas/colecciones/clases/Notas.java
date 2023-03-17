package practicas.colecciones.clases;

public class Notas<T extends Alumno> {
    
    private T objeto;

    public Notas(T nuevo)
    {
        objeto = nuevo;
    }

    public void escribirNota()
    {
        System.out.println(objeto.toString() + "SOBRESALIENTE");
    }



}
