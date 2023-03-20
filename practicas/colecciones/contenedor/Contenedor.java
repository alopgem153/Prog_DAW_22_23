package practicas.colecciones.contenedor;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T> > {

    //Atributo
    private T[] lista;

    //Constructor
    public Contenedor(T[] nuevaLista)
    {
        this.lista = nuevaLista;
    }

    public void insertarAlPrincipio(T nuevoElemento)
    {
        T[] nuevaLista = Arrays.copyOf(lista, lista.length+1);

        //Copio los elementos de lista en nueva lista desde la posicion 1, dejando libre la posición 0
        System.arraycopy(lista, 0, nuevaLista, 1, lista.length);

        nuevaLista[0] = nuevoElemento;

        this.lista = nuevaLista;
    }

    public void insertarAlFinal(T nuevoElemento)
    {
        T[] nuevaLista = Arrays.copyOf(lista, lista.length+1);
        nuevaLista[nuevaLista.length-1] = nuevoElemento;

        this.lista = nuevaLista;
    }

    public T extraerDelPrincipio()
    {
        T elemento = this.lista[0];

        T[] nuevaLista = Arrays.copyOf(lista, lista.length-1);

        System.arraycopy(lista, 1, nuevaLista, 0, nuevaLista.length);

        this.lista = nuevaLista;

        return elemento;
    }

    public T extraerDelFinal()
    {
        T[] nuevaLista = Arrays.copyOf(lista, lista.length-1);

        T elemento = this.lista[lista.length-1];

        this.lista = nuevaLista;

        return elemento;
    }

    public void ordenar()
    {
        Arrays.sort(lista);
    }

    @Override
    public String toString()
    {
        return Arrays.toString(lista);
    }
    
}
