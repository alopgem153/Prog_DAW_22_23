package practicas.colecciones;

public class ColeccionGenerica<T> {
    //atributos
    private T objeto;

    //metodos
    public void insertar(T nuevo)
    {
        objeto = nuevo;
    }

    public T extraer()
    {
        T resultado = this.objeto;
        objeto = null;
        return resultado;
    }

    
}
