package practicas.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo<T extends Comparable<T>> {
    
    //Atributo
    private HashSet<T> bolsa;

    //constructor
    public Sorteo()
    {
        bolsa = new HashSet<T>();
    }


    //Metodos
    public boolean add(T elemento)
    {
        return bolsa.add(elemento);
        
    }


    public Set<T> premiados(int numeroPremios)
    {
        
        ArrayList<T> ordenar = new ArrayList<>(bolsa);

        //Voy a ordenar los elementos 
        Collections.sort(ordenar);

        //Los voy a desordenar de forma aleatoria
        Collections.shuffle(ordenar);

        //Voy a devolver los x primeros
        Set<T> bolsaPRemiados = new HashSet<>();
        for (int i = 0; i < numeroPremios; i++) 
        {
             
        }

        return bolsaPRemiados;
    }

}
